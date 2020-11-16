package basicJDBC;

import java.util.Date;

public class AdminRole {
    private int id;
    private String name;
    private String remark;
    private int status;
    private Date create_time;
    private Date update_time;

    public AdminRole(int id, String name, String remark, int status, Date create_time, Date update_time) {
        this.id = id;
        this.name = name;
        this.remark = remark;
        this.status = status;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public AdminRole() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date cteate_time) {
        this.create_time = cteate_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "basicJDBC.AdminRole{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", status=" + status +
                ", cteate_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }
}
