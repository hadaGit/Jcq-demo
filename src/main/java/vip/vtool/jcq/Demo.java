package vip.vtool.jcq;

import com.sobte.cqp.jcq.event.IType;
import vip.vtool.jcq.annotation.Bind;
import vip.vtool.jcq.entity.GroupMsg;
import vip.vtool.jcq.entity.QQMessage;
import vip.vtool.jcq.event.JcqAppAbstractImpl;

/**
 * @author lwd
 * @date 2018/6/20 16:55
 */
public class Demo extends JcqAppAbstractImpl{


    @Bind(msgType = {IType.EVENT_GroupMsg})
    public int demo2GroupMsg(QQMessage message){
        GroupMsg groupMsg = message.getGroupMsg();
        CQ.sendGroupMsg(groupMsg.getFromGroup(),String.format("来自jcq注解实现消息的自动回复：%s",groupMsg.getMsg()));

        return MSG_IGNORE;
    }

}
