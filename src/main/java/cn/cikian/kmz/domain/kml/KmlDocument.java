package cn.cikian.kmz.domain.kml;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

/**
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-05-25 17:43
 */
@Data
@XStreamAlias("Document")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KmlDocument {

    @XStreamAlias("wpml:author")
    private String author;

    @XStreamAlias("wpml:createTime")
    private String createTime;

    @XStreamAlias("wpml:updateTime")
    private String updateTime;

    @XStreamAlias("wpml:missionConfig")
    private KmlMissionConfig kmlMissionConfig;

    @XStreamAlias("Folder")
    private KmlFolder folder;


}
