package ai;

import android.content.SharedPreferences;
import java.util.Date;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final Date f548e = new Date(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Date f549f = new Date(-1);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f550a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f551b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f552c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Object f553d = new Object();

    public m(SharedPreferences sharedPreferences) {
        this.f550a = sharedPreferences;
    }

    public final l a() {
        l lVar;
        synchronized (this.f552c) {
            int i10 = this.f550a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f550a.getLong("backoff_end_time_in_millis", -1L));
            lVar = new l();
            lVar.f546a = i10;
            lVar.f547b = date;
        }
        return lVar;
    }

    public final l b() {
        l lVar;
        synchronized (this.f553d) {
            int i10 = this.f550a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f550a.getLong("realtime_backoff_end_time_in_millis", -1L));
            lVar = new l();
            lVar.f546a = i10;
            lVar.f547b = date;
        }
        return lVar;
    }

    public final void c(int i10, Date date) {
        synchronized (this.f552c) {
            this.f550a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void d(int i10, Date date) {
        synchronized (this.f553d) {
            this.f550a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
