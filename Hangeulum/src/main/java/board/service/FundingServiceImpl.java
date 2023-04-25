package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.bean.FundingDTO;
import board.dao.FundingDAO;

@Service
public class FundingServiceImpl implements FundingService {
	@Autowired
	private FundingDAO fundingDAO = null;

	@Override
	public void write(FundingDTO fundingDTO) {
		fundingDAO.write(fundingDTO);
		
	}



}
