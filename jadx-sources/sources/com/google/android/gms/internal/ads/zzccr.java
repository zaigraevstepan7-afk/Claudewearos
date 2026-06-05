package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import mc.n;
import nc.t;
import qc.l0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzccr extends zzcbf implements TextureView.SurfaceTextureListener, zzcbp {
    private final zzcbz zzc;
    private final zzcca zzd;
    private final zzcby zze;
    private final zzdsc zzf;
    private zzcbe zzg;
    private Surface zzh;
    private zzcbq zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm;
    private zzcbx zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    public zzccr(Context context, zzcca zzccaVar, zzcbz zzcbzVar, boolean z2, boolean z10, zzcby zzcbyVar, zzdsc zzdscVar) {
        super(context);
        this.zzm = 1;
        this.zzc = zzcbzVar;
        this.zzd = zzccaVar;
        this.zzo = z2;
        this.zze = zzcbyVar;
        zzccaVar.zza(this);
        this.zzf = zzdscVar;
    }

    public static /* synthetic */ void zzG(zzccr zzccrVar) {
        zzcbe zzcbeVar = zzccrVar.zzg;
        if (zzcbeVar != null) {
            zzcbeVar.zzi();
        }
    }

    public static /* synthetic */ void zzH(zzccr zzccrVar, int i10) {
        zzcbe zzcbeVar = zzccrVar.zzg;
        if (zzcbeVar != null) {
            zzcbeVar.onWindowVisibilityChanged(i10);
        }
    }

    public static /* synthetic */ void zzI(zzccr zzccrVar, String str) {
        zzcbe zzcbeVar = zzccrVar.zzg;
        if (zzcbeVar != null) {
            zzcbeVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    public static /* synthetic */ void zzJ(zzccr zzccrVar) {
        zzcbe zzcbeVar = zzccrVar.zzg;
        if (zzcbeVar != null) {
            zzcbeVar.zze();
        }
    }

    public static /* synthetic */ void zzK(zzccr zzccrVar) {
        zzcbe zzcbeVar = zzccrVar.zzg;
        if (zzcbeVar != null) {
            zzcbeVar.zza();
        }
    }

    public static /* synthetic */ void zzL(zzccr zzccrVar) {
        zzcbe zzcbeVar = zzccrVar.zzg;
        if (zzcbeVar != null) {
            zzcbeVar.zzh();
        }
    }

    public static /* synthetic */ void zzM(zzccr zzccrVar) {
        float fZza = zzccrVar.zzb.zza();
        zzcbq zzcbqVar = zzccrVar.zzi;
        if (zzcbqVar == null) {
            int i10 = l0.f13401b;
            k.g("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcbqVar.zzT(fZza, false);
        } catch (IOException e10) {
            int i11 = l0.f13401b;
            k.h("", e10);
        }
    }

    public static /* synthetic */ void zzN(zzccr zzccrVar) {
        zzcbe zzcbeVar = zzccrVar.zzg;
        if (zzcbeVar != null) {
            zzcbeVar.zzd();
        }
    }

    public static /* synthetic */ void zzO(zzccr zzccrVar, int i10, int i11) {
        zzcbe zzcbeVar = zzccrVar.zzg;
        if (zzcbeVar != null) {
            zzcbeVar.zzj(i10, i11);
        }
    }

    public static /* synthetic */ void zzP(zzccr zzccrVar) {
        zzcbe zzcbeVar = zzccrVar.zzg;
        if (zzcbeVar != null) {
            zzcbeVar.zzf();
        }
    }

    public static /* synthetic */ void zzQ(zzccr zzccrVar, String str) {
        zzcbe zzcbeVar = zzccrVar.zzg;
        if (zzcbeVar != null) {
            zzcbeVar.zzc("ExoPlayerAdapter exception", str);
        }
    }

    public static /* synthetic */ void zzS(zzccr zzccrVar) {
        zzcbe zzcbeVar = zzccrVar.zzg;
        if (zzcbeVar != null) {
            zzcbeVar.zzg();
        }
    }

    private static String zzT(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzU() {
        zzcbq zzcbqVar = this.zzi;
        if (zzcbqVar != null) {
            zzcbqVar.zzQ(true);
        }
    }

    private final void zzV() {
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccq
            @Override // java.lang.Runnable
            public final void run() {
                zzccr.zzP(this.zza);
            }
        });
        zzn();
        this.zzd.zzb();
        if (this.zzq) {
            zzp();
        }
    }

    private final void zzW(boolean z2, Integer num) {
        zzcbq zzcbqVar = this.zzi;
        if (zzcbqVar != null && !z2) {
            zzcbqVar.zzP(num);
            return;
        }
        if (this.zzj == null || this.zzh == null) {
            return;
        }
        if (z2) {
            if (!zzad()) {
                int i10 = l0.f13401b;
                k.g("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzcbqVar.zzU();
                zzY();
            }
        }
        if (this.zzj.startsWith("cache:")) {
            zzcdl zzcdlVarZzo = this.zzc.zzo(this.zzj);
            if (zzcdlVarZzo instanceof zzcdu) {
                zzcbq zzcbqVarZza = ((zzcdu) zzcdlVarZzo).zza();
                this.zzi = zzcbqVarZza;
                zzcbqVarZza.zzP(num);
                if (!this.zzi.zzV()) {
                    int i11 = l0.f13401b;
                    k.g("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzcdlVarZzo instanceof zzcdr)) {
                    String strValueOf = String.valueOf(this.zzj);
                    int i12 = l0.f13401b;
                    k.g("Stream cache miss: ".concat(strValueOf));
                    return;
                }
                zzcdr zzcdrVar = (zzcdr) zzcdlVarZzo;
                String strZzF = zzF();
                ByteBuffer byteBufferZzl = zzcdrVar.zzl();
                boolean zZzm = zzcdrVar.zzm();
                String strZzk = zzcdrVar.zzk();
                if (strZzk == null) {
                    int i13 = l0.f13401b;
                    k.g("Stream cache URL is null.");
                    return;
                } else {
                    zzcbq zzcbqVarZzE = zzE(num);
                    this.zzi = zzcbqVarZzE;
                    zzcbqVarZzE.zzG(new Uri[]{Uri.parse(strZzk)}, strZzF, byteBufferZzl, zZzm);
                }
            }
        } else {
            this.zzi = zzE(num);
            String strZzF2 = zzF();
            Uri[] uriArr = new Uri[this.zzk.length];
            int i14 = 0;
            while (true) {
                String[] strArr = this.zzk;
                if (i14 >= strArr.length) {
                    break;
                }
                uriArr[i14] = Uri.parse(strArr[i14]);
                i14++;
            }
            this.zzi.zzF(uriArr, strZzF2);
        }
        this.zzi.zzL(this);
        zzZ(this.zzh, false);
        if (this.zzi.zzV()) {
            int iZzt = this.zzi.zzt();
            this.zzm = iZzt;
            if (iZzt == 3) {
                zzV();
            }
        }
    }

    private final void zzX() {
        zzcbq zzcbqVar = this.zzi;
        if (zzcbqVar != null) {
            zzcbqVar.zzQ(false);
        }
    }

    private final void zzY() {
        if (this.zzi != null) {
            zzZ(null, true);
            zzcbq zzcbqVar = this.zzi;
            if (zzcbqVar != null) {
                zzcbqVar.zzL(null);
                this.zzi.zzH();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzZ(Surface surface, boolean z2) {
        zzcbq zzcbqVar = this.zzi;
        if (zzcbqVar == null) {
            int i10 = l0.f13401b;
            k.g("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcbqVar.zzS(surface, z2);
        } catch (IOException e10) {
            int i11 = l0.f13401b;
            k.h("", e10);
        }
    }

    private final void zzaa() {
        zzab(this.zzr, this.zzs);
    }

    private final void zzab(int i10, int i11) {
        float f10 = i11 > 0 ? i10 / i11 : 1.0f;
        if (this.zzt != f10) {
            this.zzt = f10;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzm != 1;
    }

    private final boolean zzad() {
        zzcbq zzcbqVar = this.zzi;
        return (zzcbqVar == null || !zzcbqVar.zzV() || this.zzl) ? false : true;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.zzt;
        if (f10 != 0.0f && this.zzn == null) {
            float f11 = measuredWidth;
            float f12 = f11 / measuredHeight;
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (measuredHeight * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcbx zzcbxVar = this.zzn;
        if (zzcbxVar != null) {
            zzcbxVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) throws InterruptedException {
        zzdsc zzdscVar;
        if (this.zzo) {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznu)).booleanValue() && (zzdscVar = this.zzf) != null) {
                zzdsb zzdsbVarZza = zzdscVar.zza();
                zzdsbVarZza.zzb("action", "svp_aepv");
                zzdsbVarZza.zzj();
            }
            zzcbx zzcbxVar = new zzcbx(getContext());
            this.zzn = zzcbxVar;
            zzcbxVar.zzd(surfaceTexture, i10, i11);
            zzcbx zzcbxVar2 = this.zzn;
            zzcbxVar2.start();
            SurfaceTexture surfaceTextureZzb = zzcbxVar2.zzb();
            if (surfaceTextureZzb != null) {
                surfaceTexture = surfaceTextureZzb;
            } else {
                this.zzn.zze();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzW(false, null);
        } else {
            zzZ(surface, true);
            if (!this.zze.zza) {
                zzU();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzab(i10, i11);
        } else {
            zzaa();
        }
        r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccn
            @Override // java.lang.Runnable
            public final void run() {
                zzccr.zzL(this.zza);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzcbx zzcbxVar = this.zzn;
        if (zzcbxVar != null) {
            zzcbxVar.zze();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzX();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzZ(null, true);
        }
        r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccj
            @Override // java.lang.Runnable
            public final void run() {
                zzccr.zzG(this.zza);
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i10, final int i11) {
        zzcbx zzcbxVar = this.zzn;
        if (zzcbxVar != null) {
            zzcbxVar.zzc(i10, i11);
        }
        r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcci
            @Override // java.lang.Runnable
            public final void run() {
                zzccr.zzO(this.zza, i10, i11);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzg);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i10) {
        l0.k("AdExoPlayerView3 window visibility changed to " + i10);
        r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcch
            @Override // java.lang.Runnable
            public final void run() {
                zzccr.zzH(this.zza, i10);
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzA(int i10) {
        zzcbq zzcbqVar = this.zzi;
        if (zzcbqVar != null) {
            zzcbqVar.zzN(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzB(int i10) {
        zzcbq zzcbqVar = this.zzi;
        if (zzcbqVar != null) {
            zzcbqVar.zzR(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzC(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzk = new String[]{str};
        } else {
            this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzj;
        boolean z2 = false;
        if (this.zze.zzk && str2 != null && !str.equals(str2) && this.zzm == 4) {
            z2 = true;
        }
        this.zzj = str;
        zzW(z2, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzD(int i10, int i11) {
        this.zzr = i10;
        this.zzs = i11;
        zzaa();
    }

    public final zzcbq zzE(Integer num) {
        zzcby zzcbyVar = this.zze;
        zzcbz zzcbzVar = this.zzc;
        zzcem zzcemVar = new zzcem(zzcbzVar.getContext(), zzcbyVar, zzcbzVar, num);
        int i10 = l0.f13401b;
        k.f("ExoPlayerAdapter initialized.");
        return zzcemVar;
    }

    public final String zzF() {
        zzcbz zzcbzVar = this.zzc;
        return n.D.f11577c.y(zzcbzVar.getContext(), zzcbzVar.zzm().f14321a);
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final int zza() {
        if (zzac()) {
            return (int) this.zzi.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final int zzb() {
        zzcbq zzcbqVar = this.zzi;
        if (zzcbqVar != null) {
            return zzcbqVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final int zzc() {
        if (zzac()) {
            return (int) this.zzi.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final int zzd() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final int zze() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final long zzf() {
        zzcbq zzcbqVar = this.zzi;
        if (zzcbqVar != null) {
            return zzcbqVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final long zzg() {
        zzcbq zzcbqVar = this.zzi;
        if (zzcbqVar != null) {
            return zzcbqVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final long zzh() {
        zzcbq zzcbqVar = this.zzi;
        if (zzcbqVar != null) {
            return zzcbqVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzi(final boolean z2, final long j) {
        if (this.zzc != null) {
            zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcck
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc.zzv(z2, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final String zzj() {
        return "ExoPlayer/2".concat(true != this.zzo ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzk(String str, Exception exc) {
        final String strZzT = zzT(str, exc);
        String strConcat = "ExoPlayerAdapter error: ".concat(strZzT);
        int i10 = l0.f13401b;
        k.g(strConcat);
        this.zzl = true;
        if (this.zze.zza) {
            zzX();
        }
        r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcco
            @Override // java.lang.Runnable
            public final void run() {
                zzccr.zzI(this.zza, strZzT);
            }
        });
        n.D.f11582h.zzv(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzl(String str, Exception exc) {
        final String strZzT = zzT("onLoadException", exc);
        String strConcat = "ExoPlayerAdapter exception: ".concat(strZzT);
        int i10 = l0.f13401b;
        k.g(strConcat);
        n.D.f11582h.zzv(exc, "AdExoPlayerView.onException");
        r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccl
            @Override // java.lang.Runnable
            public final void run() {
                zzccr.zzQ(this.zza, strZzT);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzm(int i10) {
        if (this.zzm != i10) {
            this.zzm = i10;
            if (i10 == 3) {
                zzV();
                return;
            }
            if (i10 != 4) {
                return;
            }
            if (this.zze.zza) {
                zzX();
            }
            this.zzd.zze();
            this.zzb.zzc();
            r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccp
                @Override // java.lang.Runnable
                public final void run() {
                    zzccr.zzK(this.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbf, com.google.android.gms.internal.ads.zzccc
    public final void zzn() {
        r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccg
            @Override // java.lang.Runnable
            public final void run() {
                zzccr.zzM(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzX();
            }
            this.zzi.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccm
                @Override // java.lang.Runnable
                public final void run() {
                    zzccr.zzN(this.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzp() {
        if (!zzac()) {
            this.zzq = true;
            return;
        }
        if (this.zze.zza) {
            zzU();
        }
        this.zzi.zzO(true);
        this.zzd.zzc();
        this.zzb.zzb();
        this.zza.zzb();
        r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccf
            @Override // java.lang.Runnable
            public final void run() {
                zzccr.zzJ(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzq(int i10) {
        if (zzac()) {
            this.zzi.zzI(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzr(zzcbe zzcbeVar) {
        this.zzg = zzcbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzs(String str) {
        if (str != null) {
            zzC(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzt() {
        if (zzad()) {
            this.zzi.zzU();
            zzY();
        }
        zzcca zzccaVar = this.zzd;
        zzccaVar.zze();
        this.zzb.zzc();
        zzccaVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzu(float f10, float f11) {
        zzcbx zzcbxVar = this.zzn;
        if (zzcbxVar != null) {
            zzcbxVar.zzf(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzv() {
        r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcce
            @Override // java.lang.Runnable
            public final void run() {
                zzccr.zzS(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final Integer zzw() {
        zzcbq zzcbqVar = this.zzi;
        if (zzcbqVar != null) {
            return zzcbqVar.zzC();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzx(int i10) {
        zzcbq zzcbqVar = this.zzi;
        if (zzcbqVar != null) {
            zzcbqVar.zzJ(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzy(int i10) {
        zzcbq zzcbqVar = this.zzi;
        if (zzcbqVar != null) {
            zzcbqVar.zzK(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzz(int i10) {
        zzcbq zzcbqVar = this.zzi;
        if (zzcbqVar != null) {
            zzcbqVar.zzM(i10);
        }
    }
}
