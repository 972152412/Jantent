package springboot.service;

import com.github.pagehelper.PageInfo;
import springboot.modal.vo.AttachVo;

public interface IAttachService {
    /**
     * 分页查询文件
     *
     * @param page
     * @param limit
     * @return
     */
    PageInfo<AttachVo> getAttachs(Integer page, Integer limit);

    /**
     * 保存文件
     *
     * @param fname
     * @param fkey
     * @param ftype
     * @param author
     */
    void save(String fname, String fkey, String ftype, Integer author);

    /**
     * 根据文件Id,查询文件
     *
     * @param id
     * @return
     */
    AttachVo selectById(Integer id);

    /**
     * 删除文件
     *
     * @param id
     */
    void deleteById(Integer id);
}
