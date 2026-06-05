package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import cg.i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.internal.e0;
import ig.c;
import ig.l;
import ig.t;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import jg.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
abstract class zzacz<ResultT, CallbackT> implements zzadl<ResultT> {
    protected final int zza;
    private ResultT zzaa;
    private Status zzab;
    protected i zzc;
    protected l zzd;
    protected CallbackT zze;
    protected h zzf;
    protected zzacx<ResultT> zzg;
    protected Executor zzi;
    protected zzafm zzj;
    protected zzaff zzk;
    protected zzaem zzl;
    protected zzafz zzm;
    protected String zzn;
    protected String zzo;
    protected c zzp;
    protected String zzq;
    protected String zzr;
    protected zzym zzs;
    protected zzafn zzt;
    protected zzafi zzu;
    protected zzagi zzv;
    protected zzaga zzw;
    boolean zzx;
    private boolean zzz;
    protected final zzadb zzb = new zzadb(this);
    protected final List<t> zzh = new ArrayList();
    private boolean zzy = true;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static class zza extends LifecycleCallback {
        private final List<t> zza;

        private zza(com.google.android.gms.common.api.internal.l lVar, List<t> list) {
            super(lVar);
            this.mLifecycleFragment.b("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<t> list) {
            com.google.android.gms.common.api.internal.l fragment = LifecycleCallback.getFragment(activity);
            if (((zza) fragment.d(zza.class, "PhoneAuthActivityStopCallback")) == null) {
                new zza(fragment, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzacz(int i10) {
        this.zza = i10;
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzz = true;
        this.zzx = true;
        this.zzaa = resultt;
        this.zzg.zza(resultt, null);
    }

    public final zzacz<ResultT, CallbackT> zza(CallbackT callbackt) {
        e0.j(callbackt, "external callback cannot be null");
        this.zze = callbackt;
        return this;
    }

    public final zzacz<ResultT, CallbackT> zza(h hVar) {
        e0.j(hVar, "external failure callback cannot be null");
        this.zzf = hVar;
        return this;
    }

    public final zzacz<ResultT, CallbackT> zza(i iVar) {
        e0.j(iVar, "firebaseApp cannot be null");
        this.zzc = iVar;
        return this;
    }

    public final zzacz<ResultT, CallbackT> zza(l lVar) {
        e0.j(lVar, "firebaseUser cannot be null");
        this.zzd = lVar;
        return this;
    }

    public final zzacz<ResultT, CallbackT> zza(t tVar, Activity activity, Executor executor, String str) {
        t tVarZza = zzads.zza(str, tVar, this);
        synchronized (this.zzh) {
            List<t> list = this.zzh;
            e0.i(tVarZza);
            list.add(tVarZza);
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        e0.i(executor);
        this.zzi = executor;
        return this;
    }

    public static /* synthetic */ void zza(zzacz zzaczVar) {
        zzaczVar.zzb();
        e0.k("no success or failure set on method implementation", zzaczVar.zzz);
    }

    public static /* synthetic */ void zza(zzacz zzaczVar, Status status) {
        h hVar = zzaczVar.zzf;
        if (hVar != null) {
            hVar.zza(status);
        }
    }

    public final void zza(Status status) {
        this.zzz = true;
        this.zzx = false;
        this.zzab = status;
        this.zzg.zza(null, status);
    }
}
