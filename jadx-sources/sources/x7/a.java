package x7;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import t7.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f19839b = m.l("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f19840a;

    public a(Context context) {
        this.f19840a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
