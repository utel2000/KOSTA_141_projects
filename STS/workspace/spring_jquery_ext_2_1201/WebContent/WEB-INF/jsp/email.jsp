<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<script>
	$(function(){

	});
</script>	    
<!--   -->
<div id="article">
	<div id="header2">
		<h1>  uri : jQuery : </h1>
		<p id="time">2016. 5. 30.</p>
	</div>
	<div id="content">
	<h1>Spring MVC - Send e-mail with attachments</h1>
        <form method="post" action="sendEmail" 
        					enctype="multipart/form-data">
            <table width="80%">
                <tr>
                    <td>Email To:</td>
                    <td><input type="text" name="mailTo" /></td>
                </tr>
                <tr>
                    <td>Subject:</td>
                    <td><input type="text" name="subject" /></td>
                </tr>
                <tr>
                    <td>Message:</td>
                    <td><textarea cols="50" rows="10" name="text"></textarea></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Send E-mail" />
                    </td>
                </tr>
            </table>
        </form>
	</div>
</div>