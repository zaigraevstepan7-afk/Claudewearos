package u7;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends x6.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16826c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f16827d;

    public h(Context context, int i10, int i11) {
        super(i10, i11);
        this.f16827d = context;
    }

    @Override // x6.a
    public final void a(f7.b bVar) {
        switch (this.f16826c) {
            case 0:
                if (this.f19838b >= 10) {
                    bVar.y(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f16827d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                bVar.j("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f16827d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j4 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    bVar.f();
                    try {
                        bVar.y(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        bVar.y(new Object[]{"reschedule_needed", Long.valueOf(j4)});
                        sharedPreferences.edit().clear().apply();
                        bVar.z();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i10 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i11 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    bVar.f();
                    try {
                        bVar.y(new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                        bVar.y(new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                        sharedPreferences2.edit().clear().apply();
                        bVar.z();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public h(Context context) {
        super(9, 10);
        this.f16827d = context;
    }
}
