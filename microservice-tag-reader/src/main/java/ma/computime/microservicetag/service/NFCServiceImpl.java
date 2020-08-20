package ma.computime.microservicetag.service;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
//@Transactional
public class NFCServiceImpl implements NFCService {

//    private final TagDao tagDao;
//
//    @Autowired
//    public NFCServiceImpl(TagDao tagDao) {
//        this.tagDao = tagDao;
//    }
//
    @Override
    public List<String> tagFormat(String s) {
        return formatCSV(s);
    }
//
//    @Override
//    public Tag findParUid(String s) {
//        return tagDao.findByUid(s);
//    }
//
//    @Override
//    public Tag addTag(Tag tag) {
//        return tagDao.save(tag);
//    }
//
//    @Override
//    public List<Tag> allTag() {
//        return tagDao.findAll();
//    }
//
//    @Override
//    public void deleteTag(String s) {
//        tagDao.deleteById(s);
//    }


    private static List<String> formatCSV(String s) {
        List<String> list;
        String separator = ",";
        list = Arrays.asList(s.split(separator));
        return list;
    }


}
