package com.sbxxxia.web.proxies;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Pager {

    private int rowCount, startRow, endRow,
                pageCount, pageSize, startPage, endPage, nowPage,
                blockCount, blockSize, preBlock, nextBlock, nowBlock;
    private boolean existPrev, existNext;

    public void paging(){
        rowCount = 0;
        startRow = nowPage * pageSize;
        endRow = (nowPage != (pageCount-1)) ? startRow + (pageSize-1) : rowCount-1;
        pageCount = (rowCount % pageSize != 0) ? rowCount / pageSize + 1 : rowCount / pageSize;
        pageSize = 5;
        startPage = nowBlock * blockSize;
        endPage = (nowBlock != (blockCount-1)) ? startPage + (blockSize-1) : pageCount-1;
        nowPage = 1;
        blockCount = (pageCount % blockSize != 0) ? pageCount / blockSize +1 : pageCount / blockSize;
        blockSize = 5;
        preBlock = startPage - blockSize;
        nextBlock = startPage + blockSize;
        nowBlock = nowPage / blockSize;
        existPrev = nowBlock != 0;
        existNext = (nowBlock + 1) != blockCount;
    }
}
