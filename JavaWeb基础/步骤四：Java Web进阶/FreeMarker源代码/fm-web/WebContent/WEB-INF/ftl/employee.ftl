
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>Ա���б�</title>
    <link href="css/bootstrap.css" type="text/css" rel="stylesheet"></link>
    
    <script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.js"></script>

    <style type="text/css">
        .pagination {
            margin: 0px
        }

        .pagination > li > a, .pagination > li > span {
            margin: 0 5px;
            border: 1px solid #dddddd;
        }

        .glyphicon {
            margin-right: 3px;
        }

        .form-control[readonly] {
            cursor: pointer;
            background-color: white;
        }
        #dlgPhoto .modal-body{
            text-align: center;
        }
        .preview{

            max-width: 500px;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="row">
        <h1 style="text-align: center">IMOOCԱ����Ϣ��</h1>
        <div class="panel panel-default">
            <div class="clearfix panel-heading ">
                <div class="input-group" style="width: 500px;">
                    
                </div>
            </div>

            <table class="table table-bordered table-hover">
                <thead>
                <tr>
                    <th>���</th>
                    <th>Ա�����</th>
                    <th>����</th>
                    <th>����</th>
                    <th>ְ��</th>
                    <th>����</th>
                    <th>&nbsp;</th>
                </tr>
                </thead>
                <tbody>
                <#list employee_list as emp>
                <tr>
                    <td>${emp_index + 1}</td>
                    <td>${emp.empno?string("0")}</td>
                    <td>${emp.ename}</td>
                    <td>${emp.department}</td>
                    <td>${emp.job}</td>
                    <td style="color: red;font-weight: bold">��${emp.salary?string("0.00")}</td>
                    
                </tr>
				</#list>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>