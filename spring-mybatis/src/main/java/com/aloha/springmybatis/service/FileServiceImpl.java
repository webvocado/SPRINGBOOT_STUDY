package com.aloha.springmybatis.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.aloha.springmybatis.dto.Files;

import jakarta.servlet.http.HttpServletResponse;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public List<Files> list() throws Exception {
        
        throw new UnsupportedOperationException("Unimplemented method 'list'");
    }

    @Override
    public Files select(int boardNo) throws Exception {
        
        throw new UnsupportedOperationException("Unimplemented method 'select'");
    }

    @Override
    public int insert(Files board) throws Exception {
        
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public int update(Files board) throws Exception {
        
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public int delete(int boardNo) throws Exception {
        
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<Files> listByParent(Files file) throws Exception {
        
        throw new UnsupportedOperationException("Unimplemented method 'listByParent'");
    }

    @Override
    public int deleteByParent(Files file) throws Exception {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteByParent'");
    }

    @Override
    public int upload(String parentTable, int parentNo, List<MultipartFile> fileList) throws Exception {
        
        throw new UnsupportedOperationException("Unimplemented method 'upload'");
    }

    @Override
    public int download(int fileNo, HttpServletResponse response) throws Exception {
        
        throw new UnsupportedOperationException("Unimplemented method 'download'");
    }
    
}
