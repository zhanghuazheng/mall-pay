<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>订单支付</title>
</head>
<body>
<script src="https://cdn.bootcss.com/jquery/1.5.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/jquery.qrcode/1.0/jquery.qrcode.min.js"></script>
<div id="myQrcode">

</div>


<script>
    jQuery("#myQrcode").qrcode({
        text : "${code}"
    });
</script>

</body>
</html>

