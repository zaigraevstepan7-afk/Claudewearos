package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.common.zzi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 extends zzi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3630a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(f fVar, Looper looper) {
        super(looper);
        this.f3630a = fVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f3630a.zzd.get() != message.arg1) {
            int i10 = message.what;
            if (i10 == 2 || i10 == 1 || i10 == 7) {
                b0 b0Var = (b0) message.obj;
                b0Var.getClass();
                b0Var.c();
                return;
            }
            return;
        }
        int i11 = message.what;
        if ((i11 == 1 || i11 == 7 || ((i11 == 4 && !this.f3630a.enableLocalFallback()) || message.what == 5)) && !this.f3630a.isConnecting()) {
            b0 b0Var2 = (b0) message.obj;
            b0Var2.getClass();
            b0Var2.c();
            return;
        }
        int i12 = message.what;
        if (i12 == 4) {
            this.f3630a.zzB = new nd.b(message.arg2);
            if (f.zzo(this.f3630a)) {
                f fVar = this.f3630a;
                if (!fVar.zzC) {
                    fVar.a(3, null);
                    return;
                }
            }
            f fVar2 = this.f3630a;
            nd.b bVar = fVar2.zzB != null ? fVar2.zzB : new nd.b(8);
            this.f3630a.zzc.a(bVar);
            this.f3630a.onConnectionFailed(bVar);
            return;
        }
        if (i12 == 5) {
            f fVar3 = this.f3630a;
            nd.b bVar2 = fVar3.zzB != null ? fVar3.zzB : new nd.b(8);
            this.f3630a.zzc.a(bVar2);
            this.f3630a.onConnectionFailed(bVar2);
            return;
        }
        if (i12 == 3) {
            Object obj = message.obj;
            nd.b bVar3 = new nd.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f3630a.zzc.a(bVar3);
            this.f3630a.onConnectionFailed(bVar3);
            return;
        }
        if (i12 == 6) {
            this.f3630a.a(5, null);
            f fVar4 = this.f3630a;
            if (fVar4.zzw != null) {
                fVar4.zzw.onConnectionSuspended(message.arg2);
            }
            this.f3630a.onConnectionSuspended(message.arg2);
            f.zzn(this.f3630a, 5, 1, null);
            return;
        }
        if (i12 == 2 && !this.f3630a.isConnected()) {
            b0 b0Var3 = (b0) message.obj;
            b0Var3.getClass();
            b0Var3.c();
            return;
        }
        int i13 = message.what;
        if (i13 != 2 && i13 != 1 && i13 != 7) {
            Log.wtf("GmsClient", m6.a.d(i13, "Don't know how to handle message: "), new Exception());
            return;
        }
        b0 b0Var4 = (b0) message.obj;
        synchronized (b0Var4) {
            try {
                bool = b0Var4.f3620a;
                if (b0Var4.f3621b) {
                    Log.w("GmsClient", "Callback proxy " + b0Var4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bool != null) {
            f fVar5 = b0Var4.f3625f;
            int i14 = b0Var4.f3623d;
            if (i14 != 0) {
                fVar5.a(1, null);
                Bundle bundle = b0Var4.f3624e;
                b0Var4.a(new nd.b(i14, bundle != null ? (PendingIntent) bundle.getParcelable(f.KEY_PENDING_INTENT) : null));
            } else if (!b0Var4.b()) {
                fVar5.a(1, null);
                b0Var4.a(new nd.b(8, null));
            }
        }
        synchronized (b0Var4) {
            b0Var4.f3621b = true;
        }
        b0Var4.c();
    }
}
