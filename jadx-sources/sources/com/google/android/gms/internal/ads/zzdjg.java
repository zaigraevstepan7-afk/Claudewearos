package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import mc.n;
import org.json.JSONObject;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdjg extends zzbgw implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdkk {
    private final WeakReference zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzdih zze;
    private zzazc zzf;

    public zzdjg(View view, HashMap map, HashMap map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        n nVar = n.D;
        zzcaq zzcaqVar = nVar.C;
        zzcaq.zza(view, this);
        zzcaq zzcaqVar2 = nVar.C;
        zzcaq.zzb(view, this);
        this.zza = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.zzb.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.zzd.putAll(this.zzb);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.zzc.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.zzd.putAll(this.zzc);
        this.zzf = new zzazc(view.getContext(), view);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdih zzdihVar = this.zze;
        if (zzdihVar != null) {
            zzdihVar.zzD(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdih zzdihVar = this.zze;
        if (zzdihVar != null) {
            zzdihVar.zzB(zzf(), zzl(), zzm(), zzdih.zzY(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdih zzdihVar = this.zze;
        if (zzdihVar != null) {
            zzdihVar.zzB(zzf(), zzl(), zzm(), zzdih.zzY(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdih zzdihVar = this.zze;
        if (zzdihVar != null) {
            zzdihVar.zzL(view, motionEvent, zzf());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final synchronized void zzb(xd.a aVar) {
        try {
            if (this.zze != null) {
                Object objU = xd.b.u(aVar);
                if (!(objU instanceof View)) {
                    int i10 = l0.f13401b;
                    k.g("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.zze.zzN((View) objU);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final synchronized void zzc(xd.a aVar) {
        Object objU = xd.b.u(aVar);
        if (!(objU instanceof zzdih)) {
            int i10 = l0.f13401b;
            k.g("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzdih zzdihVar = this.zze;
        if (zzdihVar != null) {
            zzdihVar.zzT(this);
        }
        zzdih zzdihVar2 = (zzdih) objU;
        if (!zzdihVar2.zzU()) {
            int i11 = l0.f13401b;
            k.d("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
        } else {
            this.zze = zzdihVar2;
            zzdihVar2.zzS(this);
            this.zze.zzK(zzf());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final synchronized void zzd() {
        zzdih zzdihVar = this.zze;
        if (zzdihVar != null) {
            zzdihVar.zzT(this);
            this.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final View zzf() {
        return (View) this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final synchronized View zzg(String str) {
        WeakReference weakReference = (WeakReference) this.zzd.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final FrameLayout zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final zzazc zzi() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final synchronized xd.a zzj() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.zzdkk
    public final synchronized String zzk() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final synchronized Map zzl() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final synchronized Map zzm() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final synchronized Map zzn() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final synchronized JSONObject zzp() {
        zzdih zzdihVar = this.zze;
        if (zzdihVar == null) {
            return null;
        }
        return zzdihVar.zzj(zzf(), zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final synchronized void zzq(String str, View view, boolean z2) {
        this.zzd.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.zzb.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }
}
