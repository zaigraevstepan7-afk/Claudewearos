package ph;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final long f12989b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f12990c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static j f12991d;

    /* renamed from: a, reason: collision with root package name */
    public final h9.a f12992a;

    public j(h9.a aVar) {
        this.f12992a = aVar;
    }

    public final boolean a(qh.a aVar) {
        if (TextUtils.isEmpty(aVar.f13498c)) {
            return true;
        }
        long j = aVar.f13501f + aVar.f13500e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f12992a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + f12989b;
    }
}
