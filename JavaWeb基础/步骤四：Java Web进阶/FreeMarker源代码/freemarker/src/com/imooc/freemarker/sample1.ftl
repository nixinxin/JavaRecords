<#-- Freemarkerȡֵ -->
${site}
${url}
<#-- !Ĭ��ֵ -->
${author!"�����ڵ�����"}
<#-- ?string��ʽ����� -->
${date?string("yyyy��MM��dd�� HH:mm:ss SSS")}
${number?string("0.00")}
<#if computer.sn == "1234567">
��Ҫ�豸
</#if>
SN:${computer.sn}
�ͺ�:${computer.model}
<#if computer.state == 1>
״̬:����ʹ��
<#elseif computer.state == 2>
״̬:����
<#elseif computer.state == 3>
״̬:������
</#if>

<#switch computer.state>
	<#case 1>
		״̬:����ʹ��
		<#break>
	<#case 2>
		״̬:����
		<#break>
	<#case 3>
		״̬:������
		<#break>
	<#default>
		״̬:��Ч״̬
</#switch>
<#-- ??�����ж϶����Ƿ�Ϊ��,true��Ϊ��,falseΪ�� -->
<#if computer.user??>
�û�:${computer.user}
</#if>
�ɹ�ʱ��:${computer.dop?string("yyyy��MM��dd��")}
�ɹ��۸�:${computer.price?string("0.00")}
������Ϣ:
--------------
CPU:${computer.info["cpu"]}
�ڴ�:${computer.info["memory"]!"���ڴ���Ϣ"}
