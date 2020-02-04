package com.baeldung.mapper;

import com.baeldung.dto.TransactionDTO;
import com.baeldung.entity.Transaction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-03T17:11:31-0200",
    comments = "version: 1.3.0.Final, compiler: Eclipse JDT (IDE) 3.18.0.v20190522-0428, environment: Java 1.8.0_221 (Oracle Corporation)"
)
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public List<TransactionDTO> toTransactionDTO(Collection<Transaction> transactions) {
        if ( transactions == null ) {
            return null;
        }

        List<TransactionDTO> list = new ArrayList<TransactionDTO>( transactions.size() );
        for ( Transaction transaction : transactions ) {
            list.add( TransactionMapper.toTransactionDTO( transaction ) );
        }

        return list;
    }
}
