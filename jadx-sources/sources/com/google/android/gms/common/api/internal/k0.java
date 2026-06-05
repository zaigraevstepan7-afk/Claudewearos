package com.google.android.gms.common.api.internal;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.base.zau;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f3559a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f3560b;

    public k0(b0 b0Var) {
        this.f3560b = b0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            b0 b0Var = this.f3560b;
            c0 c0Var = (c0) ((a1) b0Var.f3508b).f3506c;
            c0Var.f3516b.set(null);
            zau zauVar = c0Var.f3520f.G;
            zauVar.sendMessage(zauVar.obtainMessage(3));
            AlertDialog alertDialog = (AlertDialog) b0Var.f3507a;
            if (alertDialog.isShowing()) {
                alertDialog.dismiss();
            }
            synchronized (this) {
                try {
                    Context context2 = this.f3559a;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f3559a = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
