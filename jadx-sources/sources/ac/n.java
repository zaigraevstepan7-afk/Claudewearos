package ac;

import android.content.Context;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import u6.v;
import u6.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f406a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f407b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f408c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f409d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f410e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f411f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f412g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f413h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f414i;

    public n(WorkDatabase_Impl workDatabase_Impl) {
        this.f406a = workDatabase_Impl;
        this.f407b = new c8.b(workDatabase_Impl, 5);
        this.f408c = new c8.e(workDatabase_Impl, 3);
        this.f409d = new c8.e(workDatabase_Impl, 4);
        this.f410e = new c8.e(workDatabase_Impl, 5);
        this.f411f = new c8.e(workDatabase_Impl, 6);
        this.f412g = new c8.e(workDatabase_Impl, 7);
        this.f413h = new c8.e(workDatabase_Impl, 8);
        this.f414i = new c8.e(workDatabase_Impl, 9);
        new c8.e(workDatabase_Impl, 10);
    }

    public ArrayList a() throws Throwable {
        z zVar;
        z zVarG = z.g(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        zVarG.v(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f406a;
        workDatabase_Impl.b();
        Cursor cursorN = u0.l.n(workDatabase_Impl, zVarG);
        try {
            int iM = u0.c.m(cursorN, "required_network_type");
            int iM2 = u0.c.m(cursorN, "requires_charging");
            int iM3 = u0.c.m(cursorN, "requires_device_idle");
            int iM4 = u0.c.m(cursorN, "requires_battery_not_low");
            int iM5 = u0.c.m(cursorN, "requires_storage_not_low");
            int iM6 = u0.c.m(cursorN, "trigger_content_update_delay");
            int iM7 = u0.c.m(cursorN, "trigger_max_content_delay");
            int iM8 = u0.c.m(cursorN, "content_uri_triggers");
            int iM9 = u0.c.m(cursorN, "id");
            int iM10 = u0.c.m(cursorN, "state");
            int iM11 = u0.c.m(cursorN, "worker_class_name");
            int iM12 = u0.c.m(cursorN, "input_merger_class_name");
            int iM13 = u0.c.m(cursorN, "input");
            zVar = zVarG;
            try {
                int iM14 = u0.c.m(cursorN, "output");
                int iM15 = u0.c.m(cursorN, "initial_delay");
                int iM16 = u0.c.m(cursorN, "interval_duration");
                int iM17 = u0.c.m(cursorN, "flex_duration");
                int iM18 = u0.c.m(cursorN, "run_attempt_count");
                int iM19 = u0.c.m(cursorN, "backoff_policy");
                int iM20 = u0.c.m(cursorN, "backoff_delay_duration");
                int iM21 = u0.c.m(cursorN, "period_start_time");
                int iM22 = u0.c.m(cursorN, "minimum_retention_duration");
                int iM23 = u0.c.m(cursorN, "schedule_requested_at");
                int iM24 = u0.c.m(cursorN, "run_in_foreground");
                int iM25 = u0.c.m(cursorN, "out_of_quota_policy");
                int i10 = iM14;
                ArrayList arrayList = new ArrayList(cursorN.getCount());
                while (cursorN.moveToNext()) {
                    String string = cursorN.getString(iM9);
                    int i11 = iM9;
                    String string2 = cursorN.getString(iM11);
                    int i12 = iM11;
                    t7.c cVar = new t7.c();
                    int i13 = iM;
                    cVar.f16102a = v.L(cursorN.getInt(iM));
                    cVar.f16103b = cursorN.getInt(iM2) != 0;
                    cVar.f16104c = cursorN.getInt(iM3) != 0;
                    cVar.f16105d = cursorN.getInt(iM4) != 0;
                    cVar.f16106e = cursorN.getInt(iM5) != 0;
                    int i14 = iM2;
                    cVar.f16107f = cursorN.getLong(iM6);
                    cVar.f16108g = cursorN.getLong(iM7);
                    cVar.f16109h = v.l(cursorN.getBlob(iM8));
                    c8.i iVar = new c8.i(string, string2);
                    iVar.f3122b = v.N(cursorN.getInt(iM10));
                    iVar.f3124d = cursorN.getString(iM12);
                    iVar.f3125e = t7.f.a(cursorN.getBlob(iM13));
                    int i15 = i10;
                    iVar.f3126f = t7.f.a(cursorN.getBlob(i15));
                    int i16 = iM13;
                    i10 = i15;
                    int i17 = iM15;
                    iVar.f3127g = cursorN.getLong(i17);
                    iM15 = i17;
                    int i18 = iM3;
                    int i19 = iM16;
                    iVar.f3128h = cursorN.getLong(i19);
                    iM16 = i19;
                    int i20 = iM17;
                    iVar.f3129i = cursorN.getLong(i20);
                    int i21 = iM18;
                    iVar.f3130k = cursorN.getInt(i21);
                    int i22 = iM19;
                    iM18 = i21;
                    iVar.f3131l = v.K(cursorN.getInt(i22));
                    iM17 = i20;
                    int i23 = iM20;
                    iVar.f3132m = cursorN.getLong(i23);
                    iM20 = i23;
                    int i24 = iM21;
                    iVar.f3133n = cursorN.getLong(i24);
                    iM21 = i24;
                    int i25 = iM22;
                    iVar.f3134o = cursorN.getLong(i25);
                    iM22 = i25;
                    int i26 = iM23;
                    iVar.f3135p = cursorN.getLong(i26);
                    int i27 = iM24;
                    iVar.f3136q = cursorN.getInt(i27) != 0;
                    int i28 = iM25;
                    iM24 = i27;
                    iVar.f3137r = v.M(cursorN.getInt(i28));
                    iVar.j = cVar;
                    arrayList.add(iVar);
                    iM19 = i22;
                    iM3 = i18;
                    iM25 = i28;
                    iM23 = i26;
                    iM13 = i16;
                    iM9 = i11;
                    iM11 = i12;
                    iM = i13;
                    iM2 = i14;
                }
                cursorN.close();
                zVar.l();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorN.close();
                zVar.l();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            zVar = zVarG;
        }
    }

    public ArrayList b(int i10) throws Throwable {
        z zVar;
        int iM;
        int iM2;
        int iM3;
        int iM4;
        int iM5;
        int iM6;
        int iM7;
        int iM8;
        int iM9;
        int iM10;
        int iM11;
        int iM12;
        int iM13;
        z zVarG = z.g(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        zVarG.v(1, i10);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f406a;
        workDatabase_Impl.b();
        Cursor cursorN = u0.l.n(workDatabase_Impl, zVarG);
        try {
            iM = u0.c.m(cursorN, "required_network_type");
            iM2 = u0.c.m(cursorN, "requires_charging");
            iM3 = u0.c.m(cursorN, "requires_device_idle");
            iM4 = u0.c.m(cursorN, "requires_battery_not_low");
            iM5 = u0.c.m(cursorN, "requires_storage_not_low");
            iM6 = u0.c.m(cursorN, "trigger_content_update_delay");
            iM7 = u0.c.m(cursorN, "trigger_max_content_delay");
            iM8 = u0.c.m(cursorN, "content_uri_triggers");
            iM9 = u0.c.m(cursorN, "id");
            iM10 = u0.c.m(cursorN, "state");
            iM11 = u0.c.m(cursorN, "worker_class_name");
            iM12 = u0.c.m(cursorN, "input_merger_class_name");
            iM13 = u0.c.m(cursorN, "input");
            zVar = zVarG;
        } catch (Throwable th2) {
            th = th2;
            zVar = zVarG;
        }
        try {
            int iM14 = u0.c.m(cursorN, "output");
            int iM15 = u0.c.m(cursorN, "initial_delay");
            int iM16 = u0.c.m(cursorN, "interval_duration");
            int iM17 = u0.c.m(cursorN, "flex_duration");
            int iM18 = u0.c.m(cursorN, "run_attempt_count");
            int iM19 = u0.c.m(cursorN, "backoff_policy");
            int iM20 = u0.c.m(cursorN, "backoff_delay_duration");
            int iM21 = u0.c.m(cursorN, "period_start_time");
            int iM22 = u0.c.m(cursorN, "minimum_retention_duration");
            int iM23 = u0.c.m(cursorN, "schedule_requested_at");
            int iM24 = u0.c.m(cursorN, "run_in_foreground");
            int iM25 = u0.c.m(cursorN, "out_of_quota_policy");
            int i11 = iM14;
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (cursorN.moveToNext()) {
                String string = cursorN.getString(iM9);
                int i12 = iM9;
                String string2 = cursorN.getString(iM11);
                int i13 = iM11;
                t7.c cVar = new t7.c();
                int i14 = iM;
                cVar.f16102a = v.L(cursorN.getInt(iM));
                cVar.f16103b = cursorN.getInt(iM2) != 0;
                cVar.f16104c = cursorN.getInt(iM3) != 0;
                cVar.f16105d = cursorN.getInt(iM4) != 0;
                cVar.f16106e = cursorN.getInt(iM5) != 0;
                int i15 = iM2;
                cVar.f16107f = cursorN.getLong(iM6);
                cVar.f16108g = cursorN.getLong(iM7);
                cVar.f16109h = v.l(cursorN.getBlob(iM8));
                c8.i iVar = new c8.i(string, string2);
                iVar.f3122b = v.N(cursorN.getInt(iM10));
                iVar.f3124d = cursorN.getString(iM12);
                iVar.f3125e = t7.f.a(cursorN.getBlob(iM13));
                int i16 = i11;
                iVar.f3126f = t7.f.a(cursorN.getBlob(i16));
                int i17 = iM15;
                int i18 = iM13;
                i11 = i16;
                iVar.f3127g = cursorN.getLong(i17);
                int i19 = iM3;
                int i20 = iM16;
                iVar.f3128h = cursorN.getLong(i20);
                iM16 = i20;
                int i21 = iM17;
                iVar.f3129i = cursorN.getLong(i21);
                int i22 = iM18;
                iVar.f3130k = cursorN.getInt(i22);
                int i23 = iM19;
                iM18 = i22;
                iVar.f3131l = v.K(cursorN.getInt(i23));
                iM17 = i21;
                int i24 = iM20;
                iVar.f3132m = cursorN.getLong(i24);
                iM20 = i24;
                int i25 = iM21;
                iVar.f3133n = cursorN.getLong(i25);
                iM21 = i25;
                int i26 = iM22;
                iVar.f3134o = cursorN.getLong(i26);
                iM22 = i26;
                int i27 = iM23;
                iVar.f3135p = cursorN.getLong(i27);
                int i28 = iM24;
                iVar.f3136q = cursorN.getInt(i28) != 0;
                int i29 = iM25;
                iM24 = i28;
                iVar.f3137r = v.M(cursorN.getInt(i29));
                iVar.j = cVar;
                arrayList.add(iVar);
                iM19 = i23;
                iM3 = i19;
                iM13 = i18;
                iM25 = i29;
                iM23 = i27;
                iM15 = i17;
                iM9 = i12;
                iM11 = i13;
                iM = i14;
                iM2 = i15;
            }
            cursorN.close();
            zVar.l();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorN.close();
            zVar.l();
            throw th;
        }
    }

    public ArrayList c() throws Throwable {
        z zVar;
        int iM;
        int iM2;
        int iM3;
        int iM4;
        int iM5;
        int iM6;
        int iM7;
        int iM8;
        int iM9;
        int iM10;
        int iM11;
        int iM12;
        int iM13;
        z zVarG = z.g(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f406a;
        workDatabase_Impl.b();
        Cursor cursorN = u0.l.n(workDatabase_Impl, zVarG);
        try {
            iM = u0.c.m(cursorN, "required_network_type");
            iM2 = u0.c.m(cursorN, "requires_charging");
            iM3 = u0.c.m(cursorN, "requires_device_idle");
            iM4 = u0.c.m(cursorN, "requires_battery_not_low");
            iM5 = u0.c.m(cursorN, "requires_storage_not_low");
            iM6 = u0.c.m(cursorN, "trigger_content_update_delay");
            iM7 = u0.c.m(cursorN, "trigger_max_content_delay");
            iM8 = u0.c.m(cursorN, "content_uri_triggers");
            iM9 = u0.c.m(cursorN, "id");
            iM10 = u0.c.m(cursorN, "state");
            iM11 = u0.c.m(cursorN, "worker_class_name");
            iM12 = u0.c.m(cursorN, "input_merger_class_name");
            iM13 = u0.c.m(cursorN, "input");
            zVar = zVarG;
        } catch (Throwable th2) {
            th = th2;
            zVar = zVarG;
        }
        try {
            int iM14 = u0.c.m(cursorN, "output");
            int iM15 = u0.c.m(cursorN, "initial_delay");
            int iM16 = u0.c.m(cursorN, "interval_duration");
            int iM17 = u0.c.m(cursorN, "flex_duration");
            int iM18 = u0.c.m(cursorN, "run_attempt_count");
            int iM19 = u0.c.m(cursorN, "backoff_policy");
            int iM20 = u0.c.m(cursorN, "backoff_delay_duration");
            int iM21 = u0.c.m(cursorN, "period_start_time");
            int iM22 = u0.c.m(cursorN, "minimum_retention_duration");
            int iM23 = u0.c.m(cursorN, "schedule_requested_at");
            int iM24 = u0.c.m(cursorN, "run_in_foreground");
            int iM25 = u0.c.m(cursorN, "out_of_quota_policy");
            int i10 = iM14;
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (cursorN.moveToNext()) {
                String string = cursorN.getString(iM9);
                int i11 = iM9;
                String string2 = cursorN.getString(iM11);
                int i12 = iM11;
                t7.c cVar = new t7.c();
                int i13 = iM;
                cVar.f16102a = v.L(cursorN.getInt(iM));
                cVar.f16103b = cursorN.getInt(iM2) != 0;
                cVar.f16104c = cursorN.getInt(iM3) != 0;
                cVar.f16105d = cursorN.getInt(iM4) != 0;
                cVar.f16106e = cursorN.getInt(iM5) != 0;
                int i14 = iM2;
                cVar.f16107f = cursorN.getLong(iM6);
                cVar.f16108g = cursorN.getLong(iM7);
                cVar.f16109h = v.l(cursorN.getBlob(iM8));
                c8.i iVar = new c8.i(string, string2);
                iVar.f3122b = v.N(cursorN.getInt(iM10));
                iVar.f3124d = cursorN.getString(iM12);
                iVar.f3125e = t7.f.a(cursorN.getBlob(iM13));
                int i15 = i10;
                iVar.f3126f = t7.f.a(cursorN.getBlob(i15));
                int i16 = iM13;
                i10 = i15;
                int i17 = iM15;
                iVar.f3127g = cursorN.getLong(i17);
                iM15 = i17;
                int i18 = iM3;
                int i19 = iM16;
                iVar.f3128h = cursorN.getLong(i19);
                iM16 = i19;
                int i20 = iM17;
                iVar.f3129i = cursorN.getLong(i20);
                int i21 = iM18;
                iVar.f3130k = cursorN.getInt(i21);
                int i22 = iM19;
                iM18 = i21;
                iVar.f3131l = v.K(cursorN.getInt(i22));
                iM17 = i20;
                int i23 = iM20;
                iVar.f3132m = cursorN.getLong(i23);
                iM20 = i23;
                int i24 = iM21;
                iVar.f3133n = cursorN.getLong(i24);
                iM21 = i24;
                int i25 = iM22;
                iVar.f3134o = cursorN.getLong(i25);
                iM22 = i25;
                int i26 = iM23;
                iVar.f3135p = cursorN.getLong(i26);
                int i27 = iM24;
                iVar.f3136q = cursorN.getInt(i27) != 0;
                int i28 = iM25;
                iM24 = i27;
                iVar.f3137r = v.M(cursorN.getInt(i28));
                iVar.j = cVar;
                arrayList.add(iVar);
                iM19 = i22;
                iM3 = i18;
                iM25 = i28;
                iM23 = i26;
                iM13 = i16;
                iM9 = i11;
                iM11 = i12;
                iM = i13;
                iM2 = i14;
            }
            cursorN.close();
            zVar.l();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorN.close();
            zVar.l();
            throw th;
        }
    }

    public ArrayList d() {
        z zVar;
        int iM;
        int iM2;
        int iM3;
        int iM4;
        int iM5;
        int iM6;
        int iM7;
        int iM8;
        int iM9;
        int iM10;
        int iM11;
        int iM12;
        int iM13;
        z zVarG = z.g(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f406a;
        workDatabase_Impl.b();
        Cursor cursorN = u0.l.n(workDatabase_Impl, zVarG);
        try {
            iM = u0.c.m(cursorN, "required_network_type");
            iM2 = u0.c.m(cursorN, "requires_charging");
            iM3 = u0.c.m(cursorN, "requires_device_idle");
            iM4 = u0.c.m(cursorN, "requires_battery_not_low");
            iM5 = u0.c.m(cursorN, "requires_storage_not_low");
            iM6 = u0.c.m(cursorN, "trigger_content_update_delay");
            iM7 = u0.c.m(cursorN, "trigger_max_content_delay");
            iM8 = u0.c.m(cursorN, "content_uri_triggers");
            iM9 = u0.c.m(cursorN, "id");
            iM10 = u0.c.m(cursorN, "state");
            iM11 = u0.c.m(cursorN, "worker_class_name");
            iM12 = u0.c.m(cursorN, "input_merger_class_name");
            iM13 = u0.c.m(cursorN, "input");
            zVar = zVarG;
        } catch (Throwable th2) {
            th = th2;
            zVar = zVarG;
        }
        try {
            int iM14 = u0.c.m(cursorN, "output");
            int iM15 = u0.c.m(cursorN, "initial_delay");
            int iM16 = u0.c.m(cursorN, "interval_duration");
            int iM17 = u0.c.m(cursorN, "flex_duration");
            int iM18 = u0.c.m(cursorN, "run_attempt_count");
            int iM19 = u0.c.m(cursorN, "backoff_policy");
            int iM20 = u0.c.m(cursorN, "backoff_delay_duration");
            int iM21 = u0.c.m(cursorN, "period_start_time");
            int iM22 = u0.c.m(cursorN, "minimum_retention_duration");
            int iM23 = u0.c.m(cursorN, "schedule_requested_at");
            int iM24 = u0.c.m(cursorN, "run_in_foreground");
            int iM25 = u0.c.m(cursorN, "out_of_quota_policy");
            int i10 = iM14;
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (cursorN.moveToNext()) {
                String string = cursorN.getString(iM9);
                int i11 = iM9;
                String string2 = cursorN.getString(iM11);
                int i12 = iM11;
                t7.c cVar = new t7.c();
                int i13 = iM;
                cVar.f16102a = v.L(cursorN.getInt(iM));
                cVar.f16103b = cursorN.getInt(iM2) != 0;
                cVar.f16104c = cursorN.getInt(iM3) != 0;
                cVar.f16105d = cursorN.getInt(iM4) != 0;
                cVar.f16106e = cursorN.getInt(iM5) != 0;
                int i14 = iM2;
                cVar.f16107f = cursorN.getLong(iM6);
                cVar.f16108g = cursorN.getLong(iM7);
                cVar.f16109h = v.l(cursorN.getBlob(iM8));
                c8.i iVar = new c8.i(string, string2);
                iVar.f3122b = v.N(cursorN.getInt(iM10));
                iVar.f3124d = cursorN.getString(iM12);
                iVar.f3125e = t7.f.a(cursorN.getBlob(iM13));
                int i15 = i10;
                iVar.f3126f = t7.f.a(cursorN.getBlob(i15));
                int i16 = iM13;
                i10 = i15;
                int i17 = iM15;
                iVar.f3127g = cursorN.getLong(i17);
                iM15 = i17;
                int i18 = iM3;
                int i19 = iM16;
                iVar.f3128h = cursorN.getLong(i19);
                iM16 = i19;
                int i20 = iM17;
                iVar.f3129i = cursorN.getLong(i20);
                int i21 = iM18;
                iVar.f3130k = cursorN.getInt(i21);
                int i22 = iM19;
                iM18 = i21;
                iVar.f3131l = v.K(cursorN.getInt(i22));
                iM17 = i20;
                int i23 = iM20;
                iVar.f3132m = cursorN.getLong(i23);
                iM20 = i23;
                int i24 = iM21;
                iVar.f3133n = cursorN.getLong(i24);
                iM21 = i24;
                int i25 = iM22;
                iVar.f3134o = cursorN.getLong(i25);
                iM22 = i25;
                int i26 = iM23;
                iVar.f3135p = cursorN.getLong(i26);
                int i27 = iM24;
                iVar.f3136q = cursorN.getInt(i27) != 0;
                int i28 = iM25;
                iM24 = i27;
                iVar.f3137r = v.M(cursorN.getInt(i28));
                iVar.j = cVar;
                arrayList.add(iVar);
                iM19 = i22;
                iM3 = i18;
                iM25 = i28;
                iM23 = i26;
                iM13 = i16;
                iM9 = i11;
                iM11 = i12;
                iM = i13;
                iM2 = i14;
            }
            cursorN.close();
            zVar.l();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorN.close();
            zVar.l();
            throw th;
        }
    }

    public int e(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f406a;
        z zVarG = z.g(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            zVarG.R(1);
        } else {
            zVarG.k(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorN = u0.l.n(workDatabase_Impl, zVarG);
        try {
            return cursorN.moveToFirst() ? v.N(cursorN.getInt(0)) : 0;
        } finally {
            cursorN.close();
            zVarG.l();
        }
    }

    public ArrayList f() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f406a;
        z zVarG = z.g(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        zVarG.R(1);
        workDatabase_Impl.b();
        Cursor cursorN = u0.l.n(workDatabase_Impl, zVarG);
        try {
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (cursorN.moveToNext()) {
                arrayList.add(cursorN.getString(0));
            }
            return arrayList;
        } finally {
            cursorN.close();
            zVarG.l();
        }
    }

    public ArrayList g() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f406a;
        z zVarG = z.g(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        zVarG.k(1, "offline_ping_sender_work");
        workDatabase_Impl.b();
        Cursor cursorN = u0.l.n(workDatabase_Impl, zVarG);
        try {
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (cursorN.moveToNext()) {
                arrayList.add(cursorN.getString(0));
            }
            return arrayList;
        } finally {
            cursorN.close();
            zVarG.l();
        }
    }

    public c8.i h(String str) {
        z zVar;
        int iM;
        int iM2;
        int iM3;
        int iM4;
        int iM5;
        int iM6;
        int iM7;
        int iM8;
        int iM9;
        int iM10;
        int iM11;
        int iM12;
        int iM13;
        int iM14;
        c8.i iVar;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f406a;
        z zVarG = z.g(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            zVarG.R(1);
        } else {
            zVarG.k(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorN = u0.l.n(workDatabase_Impl, zVarG);
        try {
            iM = u0.c.m(cursorN, "required_network_type");
            iM2 = u0.c.m(cursorN, "requires_charging");
            iM3 = u0.c.m(cursorN, "requires_device_idle");
            iM4 = u0.c.m(cursorN, "requires_battery_not_low");
            iM5 = u0.c.m(cursorN, "requires_storage_not_low");
            iM6 = u0.c.m(cursorN, "trigger_content_update_delay");
            iM7 = u0.c.m(cursorN, "trigger_max_content_delay");
            iM8 = u0.c.m(cursorN, "content_uri_triggers");
            iM9 = u0.c.m(cursorN, "id");
            iM10 = u0.c.m(cursorN, "state");
            iM11 = u0.c.m(cursorN, "worker_class_name");
            iM12 = u0.c.m(cursorN, "input_merger_class_name");
            iM13 = u0.c.m(cursorN, "input");
            iM14 = u0.c.m(cursorN, "output");
            zVar = zVarG;
        } catch (Throwable th2) {
            th = th2;
            zVar = zVarG;
        }
        try {
            int iM15 = u0.c.m(cursorN, "initial_delay");
            int iM16 = u0.c.m(cursorN, "interval_duration");
            int iM17 = u0.c.m(cursorN, "flex_duration");
            int iM18 = u0.c.m(cursorN, "run_attempt_count");
            int iM19 = u0.c.m(cursorN, "backoff_policy");
            int iM20 = u0.c.m(cursorN, "backoff_delay_duration");
            int iM21 = u0.c.m(cursorN, "period_start_time");
            int iM22 = u0.c.m(cursorN, "minimum_retention_duration");
            int iM23 = u0.c.m(cursorN, "schedule_requested_at");
            int iM24 = u0.c.m(cursorN, "run_in_foreground");
            int iM25 = u0.c.m(cursorN, "out_of_quota_policy");
            if (cursorN.moveToFirst()) {
                String string = cursorN.getString(iM9);
                String string2 = cursorN.getString(iM11);
                t7.c cVar = new t7.c();
                cVar.f16102a = v.L(cursorN.getInt(iM));
                cVar.f16103b = cursorN.getInt(iM2) != 0;
                cVar.f16104c = cursorN.getInt(iM3) != 0;
                cVar.f16105d = cursorN.getInt(iM4) != 0;
                cVar.f16106e = cursorN.getInt(iM5) != 0;
                cVar.f16107f = cursorN.getLong(iM6);
                cVar.f16108g = cursorN.getLong(iM7);
                cVar.f16109h = v.l(cursorN.getBlob(iM8));
                iVar = new c8.i(string, string2);
                iVar.f3122b = v.N(cursorN.getInt(iM10));
                iVar.f3124d = cursorN.getString(iM12);
                iVar.f3125e = t7.f.a(cursorN.getBlob(iM13));
                iVar.f3126f = t7.f.a(cursorN.getBlob(iM14));
                iVar.f3127g = cursorN.getLong(iM15);
                iVar.f3128h = cursorN.getLong(iM16);
                iVar.f3129i = cursorN.getLong(iM17);
                iVar.f3130k = cursorN.getInt(iM18);
                iVar.f3131l = v.K(cursorN.getInt(iM19));
                iVar.f3132m = cursorN.getLong(iM20);
                iVar.f3133n = cursorN.getLong(iM21);
                iVar.f3134o = cursorN.getLong(iM22);
                iVar.f3135p = cursorN.getLong(iM23);
                iVar.f3136q = cursorN.getInt(iM24) != 0;
                iVar.f3137r = v.M(cursorN.getInt(iM25));
                iVar.j = cVar;
            } else {
                iVar = null;
            }
            cursorN.close();
            zVar.l();
            return iVar;
        } catch (Throwable th3) {
            th = th3;
            cursorN.close();
            zVar.l();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03e8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(ub.i r43, int r44) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.n.i(ub.i, int):void");
    }

    public void j(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f406a;
        workDatabase_Impl.b();
        c8.e eVar = (c8.e) this.f413h;
        g7.i iVarA = eVar.a();
        iVarA.v(1, j);
        if (str == null) {
            iVarA.R(2);
        } else {
            iVarA.k(2, str);
        }
        workDatabase_Impl.c();
        try {
            iVarA.b();
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.h();
            eVar.i(iVarA);
        }
    }

    public void k(String str, t7.f fVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f406a;
        workDatabase_Impl.b();
        c8.e eVar = (c8.e) this.f409d;
        g7.i iVarA = eVar.a();
        byte[] bArrC = t7.f.c(fVar);
        if (bArrC == null) {
            iVarA.R(1);
        } else {
            iVarA.E(1, bArrC);
        }
        if (str == null) {
            iVarA.R(2);
        } else {
            iVarA.k(2, str);
        }
        workDatabase_Impl.c();
        try {
            iVarA.b();
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.h();
            eVar.i(iVarA);
        }
    }

    public void l(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f406a;
        workDatabase_Impl.b();
        c8.e eVar = (c8.e) this.f410e;
        g7.i iVarA = eVar.a();
        iVarA.v(1, j);
        if (str == null) {
            iVarA.R(2);
        } else {
            iVarA.k(2, str);
        }
        workDatabase_Impl.c();
        try {
            iVarA.b();
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.h();
            eVar.i(iVarA);
        }
    }

    public void m(int i10, String... strArr) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f406a;
        workDatabase_Impl.b();
        StringBuilder sb2 = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append("?");
            if (i11 < length - 1) {
                sb2.append(",");
            }
        }
        sb2.append(")");
        String string = sb2.toString();
        fj.l.f(string, "sql");
        workDatabase_Impl.a();
        workDatabase_Impl.b();
        g7.i iVarM = workDatabase_Impl.j().H().m(string);
        iVarM.v(1, v.i0(i10));
        int i12 = 2;
        for (String str : strArr) {
            if (str == null) {
                iVarM.R(i12);
            } else {
                iVarM.k(i12, str);
            }
            i12++;
        }
        workDatabase_Impl.c();
        try {
            iVarM.b();
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.h();
        }
    }

    public n(Context context, vb.d dVar, bc.d dVar2, d dVar3, Executor executor, cc.c cVar, dc.a aVar, dc.a aVar2, bc.c cVar2) {
        this.f406a = context;
        this.f407b = dVar;
        this.f408c = dVar2;
        this.f409d = dVar3;
        this.f410e = executor;
        this.f411f = cVar;
        this.f412g = aVar;
        this.f413h = aVar2;
        this.f414i = cVar2;
    }
}
