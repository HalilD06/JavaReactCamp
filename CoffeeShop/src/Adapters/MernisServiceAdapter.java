package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalId()), customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), customer.getDateofBirth());
		} catch (RemoteException e) {

			e.printStackTrace();
		}
		//return client.TCKimlikNoDogrula(customer.getNationalId(),customer.getFirstName(),customer.getLastName(),customer.getDateofBirth());
		
		return false;
	}

}
