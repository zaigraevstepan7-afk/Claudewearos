package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.e0;
import java.util.Collections;
import java.util.Map;
import mc.n;
import nc.l2;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdms extends zzbmp implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbfz {
    private View zza;
    private l2 zzb;
    private zzdih zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdms(zzdih zzdihVar, zzdim zzdimVar) {
        this.zza = zzdimVar.zzf();
        this.zzb = zzdimVar.zzj();
        this.zzc = zzdihVar;
        if (zzdimVar.zzs() != null) {
            zzdimVar.zzs().zzap(this);
        }
    }

    private final void zzg() {
        View view;
        zzdih zzdihVar = this.zzc;
        if (zzdihVar == null || (view = this.zza) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        zzdihVar.zzB(view, map, map, zzdih.zzY(view));
    }

    private final void zzh() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private static final void zzi(zzbmt zzbmtVar, int i10) {
        try {
            zzbmtVar.zze(i10);
        } catch (RemoteException e10) {
            int i11 = l0.f13401b;
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbmq
    public final l2 zzb() {
        e0.d("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        int i10 = l0.f13401b;
        k.d("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmq
    public final zzbgk zzc() {
        e0.d("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i10 = l0.f13401b;
            k.d("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdih zzdihVar = this.zzc;
        if (zzdihVar == null || zzdihVar.zzc() == null) {
            return null;
        }
        return zzdihVar.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbmq
    public final void zzd() {
        e0.d("#008 Must be called on the main UI thread.");
        zzh();
        zzdih zzdihVar = this.zzc;
        if (zzdihVar != null) {
            zzdihVar.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbmq
    public final void zze(xd.a aVar) {
        e0.d("#008 Must be called on the main UI thread.");
        zzf(aVar, new zzdmr(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbmq
    public final void zzf(xd.a aVar, zzbmt zzbmtVar) {
        e0.d("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i10 = l0.f13401b;
            k.d("Instream ad can not be shown after destroy().");
            zzi(zzbmtVar, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            int i11 = l0.f13401b;
            k.d("Instream internal error: ".concat(str));
            zzi(zzbmtVar, 0);
            return;
        }
        if (this.zze) {
            int i12 = l0.f13401b;
            k.d("Instream ad should not be used again.");
            zzi(zzbmtVar, 1);
            return;
        }
        this.zze = true;
        zzh();
        ((ViewGroup) xd.b.u(aVar)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
        zzcaq zzcaqVar = n.D.C;
        zzcaq.zza(this.zza, this);
        zzcaq.zzb(this.zza, this);
        zzg();
        try {
            zzbmtVar.zzf();
        } catch (RemoteException e10) {
            int i13 = l0.f13401b;
            k.i("#007 Could not call remote method.", e10);
        }
    }
}
