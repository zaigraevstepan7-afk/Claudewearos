package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c0 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f3515a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f3516b;

    /* renamed from: c, reason: collision with root package name */
    public final zau f3517c;

    /* renamed from: d, reason: collision with root package name */
    public final nd.e f3518d;

    /* renamed from: e, reason: collision with root package name */
    public final q.f f3519e;

    /* renamed from: f, reason: collision with root package name */
    public final h f3520f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(l lVar, h hVar) {
        super(lVar);
        nd.e eVar = nd.e.f12278d;
        this.f3516b = new AtomicReference(null);
        this.f3517c = new zau(Looper.getMainLooper());
        this.f3518d = eVar;
        this.f3519e = new q.f(0);
        this.f3520f = hVar;
        this.mLifecycleFragment.b("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i10, int i11, Intent intent) {
        AtomicReference atomicReference = this.f3516b;
        z0 z0Var = (z0) atomicReference.get();
        h hVar = this.f3520f;
        if (i10 != 1) {
            if (i10 == 2) {
                int iD = this.f3518d.d(getActivity(), nd.f.f12279a);
                if (iD == 0) {
                    atomicReference.set(null);
                    zau zauVar = hVar.G;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                    return;
                } else {
                    if (z0Var == null) {
                        return;
                    }
                    if (z0Var.f3607b.f12268b == 18 && iD == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            atomicReference.set(null);
            zau zauVar2 = hVar.G;
            zauVar2.sendMessage(zauVar2.obtainMessage(3));
            return;
        } else if (i11 == 0) {
            if (z0Var != null) {
                nd.b bVar = new nd.b(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, z0Var.f3607b.toString());
                int i12 = z0Var.f3606a;
                atomicReference.set(null);
                hVar.i(bVar, i12);
                return;
            }
            return;
        }
        if (z0Var != null) {
            nd.b bVar2 = z0Var.f3607b;
            int i13 = z0Var.f3606a;
            atomicReference.set(null);
            hVar.i(bVar2, i13);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        nd.b bVar = new nd.b(13, null);
        AtomicReference atomicReference = this.f3516b;
        z0 z0Var = (z0) atomicReference.get();
        int i10 = z0Var == null ? -1 : z0Var.f3606a;
        atomicReference.set(null);
        this.f3520f.i(bVar, i10);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f3516b.set(bundle.getBoolean("resolving_error", false) ? new z0(new nd.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        if (this.f3519e.isEmpty()) {
            return;
        }
        this.f3520f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        z0 z0Var = (z0) this.f3516b.get();
        if (z0Var == null) {
            return;
        }
        nd.b bVar = z0Var.f3607b;
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", z0Var.f3606a);
        bundle.putInt("failed_status", bVar.f12268b);
        bundle.putParcelable("failed_resolution", bVar.f12269c);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        this.f3515a = true;
        if (this.f3519e.isEmpty()) {
            return;
        }
        this.f3520f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        this.f3515a = false;
        h hVar = this.f3520f;
        hVar.getClass();
        synchronized (h.K) {
            try {
                if (hVar.D == this) {
                    hVar.D = null;
                    hVar.E.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
