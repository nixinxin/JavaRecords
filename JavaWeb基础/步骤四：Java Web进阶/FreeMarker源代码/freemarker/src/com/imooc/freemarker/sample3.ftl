${name?cap_first}
${brand?upper_case}
${brand?length}
${words?replace("blood" , "*****")}
${words?index_of("blood")}
<#-- ����?stringʵ����Ŀ������Ĳ��� -->
${(words?index_of("blood") != -1)?string("�������дʻ�","���������дʻ�")}

${n?round}
${n?floor}
${n?ceiling}

��˾����${computers?size}̨����
��һ̨:${computers?first.model}
���һ̨:${computers?last.model}

<#list computers?sort_by("price")?reverse as c>
	${c.sn}-${c.price}
</#list>
