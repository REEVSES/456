package com.test.service;
import com.test.dao.User;
import com.test.dao.UserMapper;
import com.test.utils.loginLevel.ToLayuiJson;
import com.test.utils.loginLevel.ToLayuiJson_l1;
import com.test.utils.loginLevel.ToLayuiJson_l2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Service("MemberService")
public class MemberServiceImpl implements MemberService{

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserByName(String username) {
        return userMapper.selectByName(username);
    }

    @Override
    public int resetPwd(String newpwd,String username) {
        return userMapper.resetPwd(newpwd,username);
    }

    @Override
    public ToLayuiJson toLayuiJson(List<ToLayuiJson_l1> data, String username) {
        List<ToLayuiJson_l2> reJson1List = new List<ToLayuiJson_l2>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<ToLayuiJson_l2> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(ToLayuiJson_l2 toLayuiJson_l2) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends ToLayuiJson_l2> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends ToLayuiJson_l2> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public ToLayuiJson_l2 get(int index) {
                return null;
            }

            @Override
            public ToLayuiJson_l2 set(int index, ToLayuiJson_l2 element) {
                return null;
            }

            @Override
            public void add(int index, ToLayuiJson_l2 element) {

            }

            @Override
            public ToLayuiJson_l2 remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<ToLayuiJson_l2> listIterator() {
                return null;
            }

            @Override
            public ListIterator<ToLayuiJson_l2> listIterator(int index) {
                return null;
            }

            @Override
            public List<ToLayuiJson_l2> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        ToLayuiJson_l2 reJson2 = new ToLayuiJson_l2();
        for (int i=0;i<3;i++){
            //获取返回权限文件XML数据
            reJson2.setHref("a");
            reJson2.setIcon("b");
            reJson2.setTarget(true);
            reJson2.setText("c");
            reJson1List.add(i,reJson2);
        }

        List<ToLayuiJson_l1> reJsonData = new List<ToLayuiJson_l1>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<ToLayuiJson_l1> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(ToLayuiJson_l1 toLayuiJson_l1) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends ToLayuiJson_l1> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends ToLayuiJson_l1> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public ToLayuiJson_l1 get(int index) {
                return null;
            }

            @Override
            public ToLayuiJson_l1 set(int index, ToLayuiJson_l1 element) {
                return null;
            }

            @Override
            public void add(int index, ToLayuiJson_l1 element) {

            }

            @Override
            public ToLayuiJson_l1 remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<ToLayuiJson_l1> listIterator() {
                return null;
            }

            @Override
            public ListIterator<ToLayuiJson_l1> listIterator(int index) {
                return null;
            }

            @Override
            public List<ToLayuiJson_l1> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        ToLayuiJson_l1 reJson1 = new ToLayuiJson_l1();
        for (int i=0;i<3;i++){
            //获取返回权限文件XML数据
            reJson1.setHref("a");
            reJson1.setIcon("b");
            reJson1.setSubset(reJson1List);
            reJson1.setText("c");
            reJsonData.add(i,reJson1);
        }

        return null;
    }

}
