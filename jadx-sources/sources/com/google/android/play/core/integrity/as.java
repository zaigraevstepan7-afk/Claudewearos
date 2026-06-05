package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import kf.f0;
import kf.h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class as extends f0 {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f4040a;

    /* renamed from: b, reason: collision with root package name */
    final kf.e f4041b;

    /* renamed from: c, reason: collision with root package name */
    private final h0 f4042c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4043d;

    /* renamed from: e, reason: collision with root package name */
    private final k f4044e;

    /* renamed from: f, reason: collision with root package name */
    private final Activity f4045f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, kf.e eVar) {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
        this.f4042c = new h0("RequestDialogCallbackImpl");
        this.f4043d = context.getPackageName();
        this.f4044e = kVar;
        this.f4040a = taskCompletionSource;
        this.f4045f = activity;
        this.f4041b = eVar;
    }

    @Override // kf.g0
    public final void b(Bundle bundle) {
        this.f4041b.d(this.f4040a);
        this.f4042c.b("onRequestDialog(%s)", this.f4043d);
        com.google.android.gms.common.api.j jVarA = this.f4044e.a(bundle);
        if (jVarA != null) {
            this.f4040a.trySetException(jVarA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            h0 h0Var = this.f4042c;
            Object[] objArr = {this.f4043d};
            h0Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", h0.d(h0Var.f9575a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.f4040a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f4045f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.f4041b.a()));
        h0 h0Var2 = this.f4042c;
        Object[] objArr2 = new Object[0];
        h0Var2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", h0.d(h0Var2.f9575a, "Starting dialog intent...", objArr2));
        }
        this.f4045f.startActivityForResult(intent, 0);
    }
}
