<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Example</title>
</head>
<body>
    <h1>Hello, JSP!</h1>

    <!-- 表单 -->
    <form action="submit" method="post">
        <!-- 文本框 -->
        <input type="text" name="username" placeholder="Enter your username">
        <!-- 密码框 -->
        <input type="password" name="password" placeholder="Enter your password">
        <!-- 单选按钮 -->
        <input type="radio" name="gender" value="male"> Male
        <input type="radio" name="gender" value="female"> Female
        <!-- 多选框 -->
        <input type="checkbox" name="hobby" value="reading"> Reading
        <input type="checkbox" name="hobby" value="traveling"> Traveling
        <!-- 下拉列表 -->
        <select name="country">
            <option value="usa">USA</option>
            <option value="uk">UK</option>
            <option value="canada">Canada</option>
        </select>
        <!-- 按钮 -->
        <button type="submit">Submit</button>
    </form>

    <!-- 链接 -->
    <a href="https://www.example.com">Visit Example Website</a>

    <!-- 图片 -->
    <img src="image.jpg" alt="Example Image">

    <!-- 列表 -->
    <ul>
        <li>Item 1</li>
        <li>Item 2</li>
        <li>Item 3</li>
    </ul>

    <!-- 表格 -->
    <table border="1">
        <tr>
            <th>Header 1</th>
            <th>Header 2</th>
            <th>Header 3</th>
        </tr>
        <tr>
            <td>Data 1</td>
            <td>Data 2</td>
            <td>Data 3</td>
        </tr>
    </table>
</body>
</html>
