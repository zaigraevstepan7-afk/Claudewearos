package u7;

import androidx.work.impl.WorkDatabase;
import u6.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends r {
    @Override // u6.r
    public final void a(f7.b bVar) {
        fj.l.f(bVar, "db");
        bVar.f();
        try {
            int i10 = WorkDatabase.f1235l;
            bVar.j("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f1234k) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            bVar.z();
        } finally {
            bVar.K();
        }
    }
}
