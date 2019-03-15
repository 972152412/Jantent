package springboot.service;

import springboot.modal.vo.OptionVo;

import java.util.List;
import java.util.Map;

public interface IOptionService {
    void insertOption(OptionVo optionVo);

    void insertOption(String name, String value);

    List<OptionVo> getOptions();


    /**
     * 保存一组配置
     *
     * @param options
     */
    void saveOptions(Map<String, String> options);

    /**
     * 获取网站配置
     *
     * @param name
     * @return
     */
    OptionVo getOptionByName(String name);
}
