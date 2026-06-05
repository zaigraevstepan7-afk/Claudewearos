package wh;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference f19391c;

    /* renamed from: a, reason: collision with root package name */
    public ak.v f19392a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f19393b;

    public v(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f19393b = scheduledThreadPoolExecutor;
    }

    public final synchronized u a() {
        String str;
        u uVar;
        ak.v vVar = this.f19392a;
        synchronized (((ArrayDeque) vVar.f733d)) {
            str = (String) ((ArrayDeque) vVar.f733d).peek();
        }
        Pattern pattern = u.f19387d;
        uVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                uVar = new u(strArrSplit[0], strArrSplit[1]);
            }
        }
        return uVar;
    }
}
