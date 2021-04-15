<%@include file="../../common/templates/backend/header.jsp" %>
<%@include file="../../common/templates/backend/navbar.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section class="row">
    <article class="col">
        <div class="card">
            <div class="card-header">
                Add New Product
            </div>
            <ul class="card-body">
                <form action= "InsertProductController" method="post"enctype="multipart/form-data">
                    <div class="form-group">
                        <label for="categoryId">Category:</label>
                        <select name="categoryId" id="categoryId" class="form-control">
                            <c:forEach var="category" items="${categories}">
                                <option value="${category.categoryId}">${category.name}</option>
                            </c:forEach>

                        </select>
                    </div>
                    <div class="form-group">
                        <label for="productId">Product ID: </label>
                        <input type="texr" class="form-control"id="productId"
                               name="productId"placeholder="Product ID">
                    </div>
                    <div class="form-group">
                        <label for="name">Name: </label>
                        <input type="texr" class="form-control"id="name"
                               name="name"placeholder="Product Name">
                    </div>
                    <div class="form-group">
                        <label for="quantity">Quantity: </label>
                        <input type="texr" class="form-control"id="quantity"
                               name="quantity"placeholder="Product Quantity">
                    </div>
                    <div class="form-group">
                        <label for="price">Price: </label>
                        <input type="texr" class="form-control"id="price"
                               name="price"placeholder="Product Price">
                    </div>
                    <div class="form-group">
                        <label for="status">Status: </label>
                        <select name="status"id="status"class="form-control">
                            <option value="InStock">In-stock</option>
                            <option value="OutStock">Out-stock</option>
                        </select>
                    </div>
                     <div class="form-group">
                        <label for="image">Image: </label>
                        <input type="file"name="image"id="image"class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="price">Description: </label>
                        <textarea type="text" class="form-control"id="description"
                                  name="description"placeholder="Description"></textarea>
                    </div>
                    <div class="form-group">
                        <input type="submit"value="Add New"class="btn btn-primary">
                    </div>
                </form>
            </ul>
        </div>
    </article>
</section>


<%@include file="../../common/templates/backend/footer.jsp" %>