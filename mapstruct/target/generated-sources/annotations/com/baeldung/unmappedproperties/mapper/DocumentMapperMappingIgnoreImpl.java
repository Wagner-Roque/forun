package com.baeldung.unmappedproperties.mapper;

import com.baeldung.unmappedproperties.dto.DocumentDTO;
import com.baeldung.unmappedproperties.entity.Document;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-03T16:51:58-0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_221 (Oracle Corporation)"
)
public class DocumentMapperMappingIgnoreImpl implements DocumentMapperMappingIgnore {

    @Override
    public DocumentDTO documentToDocumentDTO(Document entity) {
        if ( entity == null ) {
            return null;
        }

        DocumentDTO documentDTO = new DocumentDTO();

        documentDTO.setId( entity.getId() );
        documentDTO.setTitle( entity.getTitle() );
        documentDTO.setText( entity.getText() );

        return documentDTO;
    }

    @Override
    public Document documentDTOToDocument(DocumentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Document document = new Document();

        document.setId( dto.getId() );
        document.setTitle( dto.getTitle() );
        document.setText( dto.getText() );

        return document;
    }
}
