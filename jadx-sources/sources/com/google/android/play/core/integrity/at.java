package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class at {

    /* renamed from: a, reason: collision with root package name */
    private final kf.s f4046a;

    /* renamed from: b, reason: collision with root package name */
    private final kf.s f4047b;

    public at(kf.s sVar, kf.s sVar2) {
        this.f4046a = sVar;
        this.f4047b = sVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, kf.e eVar) {
        Context context = (Context) this.f4046a.a();
        context.getClass();
        k kVar = (k) this.f4047b.a();
        kVar.getClass();
        activity.getClass();
        eVar.getClass();
        return new as(context, kVar, activity, taskCompletionSource, eVar);
    }
}
