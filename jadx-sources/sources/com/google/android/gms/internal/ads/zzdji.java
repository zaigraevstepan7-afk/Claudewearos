package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import mc.n;
import nc.t;
import org.json.JSONObject;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdji extends zzbgq implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdkk {
    public static final zzfyf zza = zzfyf.zzq("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzgdm zzf;
    private View zzg;
    private zzdih zzi;
    private zzazc zzj;
    private zzbgk zzl;
    private boolean zzm;
    private GestureDetector zzo;
    private Map zzc = new HashMap();
    private xd.a zzk = null;
    private boolean zzn = false;
    private final int zzh = ModuleDescriptor.MODULE_VERSION;

    public zzdji(FrameLayout frameLayout, FrameLayout frameLayout2, int i10) {
        String str;
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzb = str;
        n nVar = n.D;
        zzcaq zzcaqVar = nVar.C;
        zzcaq.zza(frameLayout, this);
        zzcaq zzcaqVar2 = nVar.C;
        zzcaq.zzb(frameLayout, this);
        this.zzf = zzcad.zzf;
        this.zzj = new zzazc(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    public static /* synthetic */ void zzs(zzdji zzdjiVar) {
        if (zzdjiVar.zzg == null) {
            View view = new View(zzdjiVar.zzd.getContext());
            zzdjiVar.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (zzdjiVar.zzd != zzdjiVar.zzg.getParent()) {
            zzdjiVar.zzd.addView(zzdjiVar.zzg);
        }
    }

    private final synchronized void zzt(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.zze.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.zze.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e10) {
                        k.h("Encountered invalid base64 watermark.", e10);
                    }
                }
            }
            this.zze.addView(frameLayout);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void zzu() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjh
            @Override // java.lang.Runnable
            public final void run() {
                zzdji.zzs(this.zza);
            }
        });
    }

    private final synchronized void zzv() {
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlM)).booleanValue() || this.zzi.zza() == 0) {
            return;
        }
        this.zzo = new GestureDetector(this.zzd.getContext(), new zzdjq(this.zzi, this));
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdih zzdihVar = this.zzi;
        if (zzdihVar == null || !zzdihVar.zzV()) {
            return;
        }
        this.zzi.zzA();
        this.zzi.zzD(view, this.zzd, zzl(), zzm(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdih zzdihVar = this.zzi;
        if (zzdihVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdihVar.zzB(frameLayout, zzl(), zzm(), zzdih.zzY(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdih zzdihVar = this.zzi;
        if (zzdihVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdihVar.zzB(frameLayout, zzl(), zzm(), zzdih.zzY(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdih zzdihVar = this.zzi;
        if (zzdihVar != null) {
            zzdihVar.zzL(view, motionEvent, this.zzd);
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlM)).booleanValue() && this.zzo != null && this.zzi.zza() != 0) {
                this.zzo.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final synchronized xd.a zzb(String str) {
        return new xd.b(zzg(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final synchronized void zzc() {
        try {
            if (this.zzn) {
                return;
            }
            zzdih zzdihVar = this.zzi;
            if (zzdihVar != null) {
                zzdihVar.zzT(this);
                this.zzi = null;
            }
            this.zzc.clear();
            this.zzd.removeAllViews();
            this.zze.removeAllViews();
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzg = null;
            this.zzj = null;
            this.zzn = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void zzd(xd.a aVar) {
        onTouch(this.zzd, (MotionEvent) xd.b.u(aVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final synchronized void zzdA(xd.a aVar) {
        if (this.zzn) {
            return;
        }
        this.zzk = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final synchronized void zzdB(xd.a aVar) {
        if (this.zzn) {
            return;
        }
        Object objU = xd.b.u(aVar);
        if (!(objU instanceof zzdih)) {
            int i10 = l0.f13401b;
            k.g("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdih zzdihVar = this.zzi;
        if (zzdihVar != null) {
            zzdihVar.zzT(this);
        }
        zzu();
        zzdih zzdihVar2 = (zzdih) objU;
        this.zzi = zzdihVar2;
        zzdihVar2.zzS(this);
        this.zzi.zzK(this.zzd);
        this.zzi.zzz(this.zze);
        if (this.zzm) {
            this.zzi.zzc().zzb(this.zzl);
        }
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzeg)).booleanValue() && !TextUtils.isEmpty(this.zzi.zzg())) {
            zzt(this.zzi.zzg());
        }
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final synchronized void zzdx(String str, xd.a aVar) {
        zzq(str, (View) xd.b.u(aVar), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final synchronized void zzdy(xd.a aVar) {
        this.zzi.zzN((View) xd.b.u(aVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final synchronized void zzdz(zzbgk zzbgkVar) {
        if (!this.zzn) {
            this.zzm = true;
            this.zzl = zzbgkVar;
            zzdih zzdihVar = this.zzi;
            if (zzdihVar != null) {
                zzdihVar.zzc().zzb(zzbgkVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final synchronized void zze(xd.a aVar, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final /* synthetic */ View zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final synchronized View zzg(String str) {
        WeakReference weakReference;
        if (!this.zzn && (weakReference = (WeakReference) this.zzc.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final FrameLayout zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final zzazc zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final xd.a zzj() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final synchronized String zzk() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final synchronized Map zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final synchronized Map zzm() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final synchronized JSONObject zzo() {
        zzdih zzdihVar = this.zzi;
        if (zzdihVar == null) {
            return null;
        }
        return zzdihVar.zzi(this.zzd, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final synchronized JSONObject zzp() {
        zzdih zzdihVar = this.zzi;
        if (zzdihVar == null) {
            return null;
        }
        return zzdihVar.zzj(this.zzd, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdkk
    public final synchronized void zzq(String str, View view, boolean z2) {
        if (!this.zzn) {
            if (view == null) {
                this.zzc.remove(str);
                return;
            }
            this.zzc.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (mk.b.R(this.zzh)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    public final FrameLayout zzr() {
        return this.zzd;
    }
}
