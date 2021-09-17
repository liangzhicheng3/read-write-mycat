package com.liangzhicheng.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liangzhicheng.modules.dao.IMemberDao;
import com.liangzhicheng.modules.entity.Member;
import com.liangzhicheng.modules.service.IMemberService;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl extends ServiceImpl<IMemberDao, Member> implements IMemberService {

}
