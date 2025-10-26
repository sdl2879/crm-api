package com.crm.convert;

import com.crm.entity.Customer;
import com.crm.vo.CustomerVO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-23T10:26:47+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.16 (Eclipse Adoptium)"
)
public class CustomerConvertImpl implements CustomerConvert {

    @Override
    public Customer convert(CustomerVO customer) {
        if ( customer == null ) {
            return null;
        }

        Customer customer1 = new Customer();

        customer1.setId( customer.getId() );
        customer1.setName( customer.getName() );
        customer1.setPhone( customer.getPhone() );
        customer1.setEmail( customer.getEmail() );
        customer1.setLevel( customer.getLevel() );
        customer1.setSource( customer.getSource() );
        customer1.setAddress( customer.getAddress() );
        customer1.setFollowStatus( customer.getFollowStatus() );
        customer1.setNextFollowStatus( customer.getNextFollowStatus() );
        customer1.setRemark( customer.getRemark() );
        customer1.setCreaterId( customer.getCreaterId() );
        customer1.setIsPublic( customer.getIsPublic() );
        customer1.setOwnerId( customer.getOwnerId() );
        customer1.setIsKeyDecisionMaker( customer.getIsKeyDecisionMaker() );
        customer1.setGender( customer.getGender() );
        customer1.setDealCount( customer.getDealCount() );
        customer1.setCreateTime( customer.getCreateTime() );

        return customer1;
    }
}
