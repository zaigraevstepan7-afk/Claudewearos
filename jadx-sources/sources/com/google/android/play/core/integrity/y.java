package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import kf.h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
abstract class y {

    /* renamed from: b, reason: collision with root package name */
    private final String f4128b;

    /* renamed from: c, reason: collision with root package name */
    private final long f4129c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4131e;

    /* renamed from: a, reason: collision with root package name */
    private final h0 f4127a = new h0("IntegrityDialogWrapper");

    /* renamed from: d, reason: collision with root package name */
    private final Object f4130d = new Object();

    public y(String str, long j) {
        this.f4128b = str;
        this.f4129c = j;
    }

    public final Task a(Activity activity, int i10) {
        synchronized (this.f4130d) {
            try {
                if (this.f4131e) {
                    return Tasks.forResult(0);
                }
                this.f4131e = true;
                h0 h0Var = this.f4127a;
                Object[] objArr = {Integer.valueOf(i10)};
                h0Var.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", h0.d(h0Var.f9575a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i10);
                bundle.putString("package.name", this.f4128b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 4);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f4129c);
                return b(activity, bundle);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
