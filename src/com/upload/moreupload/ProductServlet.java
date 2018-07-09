package com.upload.moreupload;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {


//    ProductInfoService proService = new ProductInfoServiceImpl();

    /**
     * (非 Javadoc)
     * <p>Description(描述):doget方法 </p>
     * <p>Title: doGet</p>
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    /**
     * @param @param  request
     * @param @param  response
     * @param @throws IOException    设定文件
     * @return void    返回类型
     * @throws
     * @Title: addProduct
     * @Description: 添加食品信息
     */
    private void addProduct(HttpServletRequest request,
                             HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String produceName = "";            // 商品名称
        String details = "";                // 商品详情
        String price = "";                  // 价格
        int stock = 0;                      // 库存
        String uploadFileName = "";         // 上传的文件名(大图)
        String uploadFileName1 = "";        // 上传的文件名(小图1)
        String uploadFileName2 = "";        // 上传的文件名(小图2)
        String uploadFileName3 = "";        // 上传的文件名(小图3)
        String fileName = "";               // 表单字段元素的name属性值
        String filedName = "";              //获取文件名称
        String picPath = "";
        // 请求信息中的内容是否是multipart类型
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        // 上传文件的存储路径（服务器文件系统上的绝对文件路径）
        String uploadFilePath = this.getServletContext().getRealPath("/WEB-INF/upload");
        File file = new File(uploadFilePath);
        if (!file.exists() && !file.isDirectory()) {
            System.out.println("目录或文件不存在！");
            file.mkdir();
        }
        if (isMultipart) {
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            try {
                // 解析from表单中所有文件
                @SuppressWarnings("unchecked")
                List<FileItem> items = upload.parseRequest(request);
                Iterator<FileItem> iter = items.iterator();
                while (iter.hasNext()) {
                    FileItem item = (FileItem) iter.next();
                    if (item.isFormField()) {
                        // 判断，是普通表单
                        fileName = item.getFieldName();
                        // 表单字段的name属性
                        if (fileName.equals("produceName")) {
                            produceName = item.getString("utf-8");
                        } else if (fileName.equals("details")) {
                            details = item.getString("utf-8");
                        } else if (fileName.equals("price")) {
                            price = item.getString("utf-8");
                        } else if (fileName.equals("stock")) {
                            stock = Integer.parseInt(item.getString("utf-8"));
                        }
                    } else {
                        // 文件表单字段
                        // 表单字段的name属性
                        fileName = item.getFieldName();
                        if (fileName.equals("file")) {
                            filedName = item.getName();
                            if (fileName != null && !filedName.equals("")) {
                                File fullFile = new File(item.getName());
                                File saveFile = new File(uploadFilePath,
                                        fullFile.getName());
                                item.write(saveFile);
                                uploadFileName = fullFile.getName();
                                picPath = saveFile.toString();
                            }
                        } else if (fileName.equals("smallfile1")) {
                            // 小图1
                            filedName = item.getName();
                            if (fileName != null && !filedName.equals("")) {
                                File fullFile = new File(item.getName());
                                File saveFile = new File(uploadFilePath,
                                        fullFile.getName());
                                item.write(saveFile);
                                uploadFileName1 = fullFile.getName();
                                picPath = saveFile.toString();
                            }
                        } else if (fileName.equals("smallfile2")) {
                            // 小图2
                            filedName = item.getName();
                            if (fileName != null && !filedName.equals("")) {
                                File fullFile = new File(item.getName());
                                File saveFile = new File(uploadFilePath,
                                        fullFile.getName());
                                item.write(saveFile);
                                uploadFileName2 = fullFile.getName();
                                picPath = saveFile.toString();
                            }
                        } else if (fileName.equals("smallfile3")) {

                            // 小图3
                            filedName = item.getName();
                            if (fileName != null && !filedName.equals("")) {
                                File fullFile = new File(item.getName());
                                File saveFile = new File(uploadFilePath,
                                        fullFile.getName());
                                item.write(saveFile);
                                uploadFileName3 = fullFile.getName();
                                picPath = saveFile.toString();
                            }
                        }
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
//            ProductInfo product = new ProductInfo();
//            product.setProductName(produceName);
//            product.setPrice(Integer.parseInt(price));
//            product.setDetails(details);
//            product.setStock(stock);
//            product.setFileName("upload/" + uploadFileName);
//            product.setFileName_1("upload/" + uploadFileName1);
//            product.setFileName_2("upload/" + uploadFileName2);
//            product.setFileName_3("upload/" + uploadFileName3);
//            int rel = proService.addProductInfo(product);
//            if (rel > 0) {
//                // 添加商品成功之后转发到查询所有的商品界面
//                out.print("<script>alert('恭喜您，添加商品成功！');location.href='ProductInfoServlet?tag=show';</script>");
//            } else {
//                out.print("<script>alert('很抱歉，添加商品失败！');location.href='ProductInfoServlet?tag=show';</script>");
//
//            }
        }
    }

    private void addProduct1(HttpServletRequest request,
                            HttpServletResponse response) throws IOException {
        //创建一个通用的多部分解析器
//        CommonsMultipartResolver _multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
//        //判断 request 是否有文件上传,即多部分请求
//        if (_multipartResolver.isMultipart(request)) {
//            //转换成多部分request
//            MultipartHttpServletRequest _multiRequest = (MultipartHttpServletRequest) request;
//            //取得request中的所有文件名
//            Iterator<String> _iter = _multiRequest.getFileNames();
//            while (_iter.hasNext()) {
//                //取得上传文件
//                MultipartFile _file = _multiRequest.getFile(_iter.next());
//                System.out.println(_iter.next());
//                if (_file != null) {
//                    //取得当前上传文件的文件名称
//                    String _currentFileName = _file.getOriginalFilename();
//                    System.out.println(_currentFileName);
//                    //如果名称不为"",说明该文件存在，否则说明该文件不存在
//                }
//            }
//        }

    }

    /**
     * (非 Javadoc)
     * <p>Description(描述): dopost方法</p>
     * <p>Title: doPost</p>
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //创建一个通用的多部分解析器
//        CommonsMultipartResolver _multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
//        //判断 request 是否有文件上传,即多部分请求
//        if (_multipartResolver.isMultipart(request)) {
//            //转换成多部分request
//            MultipartHttpServletRequest _multiRequest = (MultipartHttpServletRequest) request;
//            //取得request中的所有文件名
//            Iterator<String> _iter = _multiRequest.getFileNames();
//            while (_iter.hasNext()) {
//                //取得上传文件
//                MultipartFile _file = _multiRequest.getFile(_iter.next());
//                System.out.println(_iter.next());
//                if (_file != null) {
//                    //取得当前上传文件的文件名称
//                    String _currentFileName = _file.getOriginalFilename();
//                    System.out.println(_currentFileName);
//                    //如果名称不为"",说明该文件存在，否则说明该文件不存在
//                }
//            }
//        }
        addProduct(request,response);
    }

}