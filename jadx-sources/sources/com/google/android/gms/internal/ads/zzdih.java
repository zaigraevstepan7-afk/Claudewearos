package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import mc.n;
import nc.a2;
import nc.p1;
import nc.s1;
import nc.t;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import qc.r0;
import rc.k;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdih extends zzcqv {
    public static final zzfyf zzc = zzfyf.zzs("3010", "3008", "1005", "1009", "2011", "2007");
    private final List zzA;
    private final Executor zzd;
    private final zzdim zze;
    private final zzdiu zzf;
    private final zzdjm zzg;
    private final zzdir zzh;
    private final zzdix zzi;
    private final zzhfs zzj;
    private final zzhfs zzk;
    private final zzhfs zzl;
    private final zzhfs zzm;
    private final zzhfs zzn;
    private zzdkk zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private final zzbyi zzt;
    private final zzavs zzu;
    private final rc.a zzv;
    private final Context zzw;
    private final zzdij zzx;
    private final zzekt zzy;
    private final Map zzz;

    public zzdih(zzcqu zzcquVar, Executor executor, zzdim zzdimVar, zzdiu zzdiuVar, zzdjm zzdjmVar, zzdir zzdirVar, zzdix zzdixVar, zzhfs zzhfsVar, zzhfs zzhfsVar2, zzhfs zzhfsVar3, zzhfs zzhfsVar4, zzhfs zzhfsVar5, zzbyi zzbyiVar, zzavs zzavsVar, rc.a aVar, Context context, zzdij zzdijVar, zzekt zzektVar, zzazd zzazdVar) {
        super(zzcquVar);
        this.zzd = executor;
        this.zze = zzdimVar;
        this.zzf = zzdiuVar;
        this.zzg = zzdjmVar;
        this.zzh = zzdirVar;
        this.zzi = zzdixVar;
        this.zzj = zzhfsVar;
        this.zzk = zzhfsVar2;
        this.zzl = zzhfsVar3;
        this.zzm = zzhfsVar4;
        this.zzn = zzhfsVar5;
        this.zzt = zzbyiVar;
        this.zzu = zzavsVar;
        this.zzv = aVar;
        this.zzw = context;
        this.zzx = zzdijVar;
        this.zzy = zzektVar;
        this.zzz = new HashMap();
        this.zzA = new ArrayList();
    }

    public static boolean zzY(View view) {
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkQ)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        r0 r0Var = n.D.f11577c;
        long jK = r0.K(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (jK >= ((Integer) r1.f12230c.zzb(zzbdc.zzkR)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized View zzaa(Map map) {
        if (map != null) {
            zzfyf zzfyfVar = zzc;
            int size = zzfyfVar.size();
            int i10 = 0;
            while (i10 < size) {
                WeakReference weakReference = (WeakReference) map.get((String) zzfyfVar.get(i10));
                i10++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzab() {
        zzdkk zzdkkVar = this.zzo;
        if (zzdkkVar == null) {
            int i10 = l0.f13401b;
            k.b("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        xd.a aVarZzj = zzdkkVar.zzj();
        if (aVarZzj != null) {
            return (ImageView.ScaleType) xd.b.u(aVarZzj);
        }
        return zzdjm.zza;
    }

    private final void zzac(String str, boolean z2) {
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfB)).booleanValue()) {
            zzf("Google", true);
            return;
        }
        mf.a aVarZzw = this.zze.zzw();
        if (aVarZzw == null) {
            return;
        }
        zzgdb.zzr(aVarZzw, new zzdif(this, "Google", true), this.zzd);
    }

    private final synchronized void zzad(View view, Map map, Map map2) {
        View viewZzaa;
        if (!this.zzr && (viewZzaa = zzaa(map)) != null) {
            zzbct zzbctVar = zzbdc.zznB;
            t tVar = t.f12227d;
            if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                Rect rect = new Rect();
                if (viewZzaa.getGlobalVisibleRect(rect, new Point()) && viewZzaa.getHeight() == rect.height() && viewZzaa.getWidth() == rect.width()) {
                    this.zzf.zzr(view, map, map2, zzab());
                    this.zzr = true;
                }
            } else if (!((Boolean) tVar.f12230c.zzb(zzbdc.zznC)).booleanValue()) {
                zzbct zzbctVar2 = zzbdc.zznD;
                if (((Float) tVar.f12230c.zzb(zzbctVar2)).floatValue() > 0.0d) {
                    double dFloatValue = ((Float) tVar.f12230c.zzb(zzbctVar2)).floatValue();
                    if (viewZzaa.getGlobalVisibleRect(new Rect(), new Point())) {
                        if (r4.height() * r4.width() >= viewZzaa.getHeight() * viewZzaa.getWidth() * (dFloatValue / 100.0d)) {
                            this.zzf.zzr(view, map, map2, zzab());
                            this.zzr = true;
                        }
                    }
                }
            } else if (zzY(viewZzaa)) {
                this.zzf.zzr(view, map, map2, zzab());
                this.zzr = true;
            }
        }
    }

    private final synchronized void zzae(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzt(view, map, map2, zzab());
        this.zzq = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaf(View view, zzecz zzeczVar) {
        zzcfe zzcfeVarZzr = this.zze.zzr();
        if (!this.zzh.zzd() || zzeczVar == null || zzcfeVarZzr == null || view == null) {
            return;
        }
        n.D.f11598y.zzj(zzeczVar.zza(), view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzag(zzdkk zzdkkVar) {
        Iterator<String> itKeys;
        View view;
        zzavn zzavnVarZzc;
        try {
            if (!this.zzp) {
                this.zzo = zzdkkVar;
                this.zzg.zze(zzdkkVar);
                this.zzf.zzB(zzdkkVar.zzf(), zzdkkVar.zzm(), zzdkkVar.zzn(), zzdkkVar, zzdkkVar);
                zzbct zzbctVar = zzbdc.zzcR;
                t tVar = t.f12227d;
                if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() && (zzavnVarZzc = this.zzu.zzc()) != null) {
                    zzavnVarZzc.zzo(zzdkkVar.zzf());
                }
                if (((Boolean) tVar.f12230c.zzb(zzbdc.zzbU)).booleanValue()) {
                    zzfbt zzfbtVar = this.zzb;
                    if (zzfbtVar.zzak && (itKeys = zzfbtVar.zzaj.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            zzdkk zzdkkVar2 = this.zzo;
                            WeakReference weakReference = zzdkkVar2 == null ? null : (WeakReference) zzdkkVar2.zzl().get(next);
                            this.zzz.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                zzazc zzazcVar = new zzazc(this.zzw, view);
                                this.zzA.add(zzazcVar);
                                zzazcVar.zzd(new zzdie(this, next));
                            }
                        }
                    }
                }
                if (zzdkkVar.zzi() != null) {
                    zzdkkVar.zzi().zzd(this.zzt);
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzah(zzdkk zzdkkVar) {
        this.zzf.zzC(zzdkkVar.zzf(), zzdkkVar.zzl());
        if (zzdkkVar.zzh() != null) {
            zzdkkVar.zzh().setClickable(false);
            zzdkkVar.zzh().removeAllViews();
        }
        if (zzdkkVar.zzi() != null) {
            zzdkkVar.zzi().zze(this.zzt);
        }
        this.zzo = null;
    }

    public static /* synthetic */ void zzs(zzdih zzdihVar, boolean z2) {
        zzdkk zzdkkVar = zzdihVar.zzo;
        if (zzdkkVar != null) {
            zzdihVar.zzf.zzq(null, zzdkkVar.zzf(), zzdihVar.zzo.zzl(), zzdihVar.zzo.zzm(), z2, zzdihVar.zzab(), 0);
        } else {
            int i10 = l0.f13401b;
            k.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        }
    }

    public static /* synthetic */ void zzt(zzdih zzdihVar) {
        try {
            zzdim zzdimVar = zzdihVar.zze;
            int iZzc = zzdimVar.zzc();
            if (iZzc == 1) {
                zzbho zzbhoVarZzb = zzdihVar.zzi.zzb();
                if (zzbhoVarZzb != null) {
                    zzdihVar.zzac("Google", true);
                    zzbhoVarZzb.zze((zzbhe) zzdihVar.zzj.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 2) {
                zzbhl zzbhlVarZza = zzdihVar.zzi.zza();
                if (zzbhlVarZza != null) {
                    zzdihVar.zzac("Google", true);
                    zzbhlVarZza.zze((zzbhc) zzdihVar.zzk.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 3) {
                zzbhu zzbhuVarZzd = zzdihVar.zzi.zzd(zzdimVar.zzA());
                if (zzbhuVarZzd != null) {
                    if (zzdimVar.zzs() != null) {
                        zzdihVar.zzf("Google", true);
                    }
                    zzbhuVarZzd.zze((zzbhh) zzdihVar.zzn.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 6) {
                zzbib zzbibVarZzf = zzdihVar.zzi.zzf();
                if (zzbibVarZzf != null) {
                    zzdihVar.zzac("Google", true);
                    zzbibVarZzf.zze((zzbih) zzdihVar.zzl.zzb());
                    return;
                }
                return;
            }
            if (iZzc != 7) {
                int i10 = l0.f13401b;
                k.d("Wrong native template id!");
            } else {
                zzbmw zzbmwVarZzg = zzdihVar.zzi.zzg();
                if (zzbmwVarZzg != null) {
                    zzbmwVarZzg.zzg((zzbmq) zzdihVar.zzm.zzb());
                }
            }
        } catch (RemoteException e10) {
            int i11 = l0.f13401b;
            k.e("RemoteException when notifyAdLoad is called", e10);
        }
    }

    public static /* synthetic */ void zzu(zzdih zzdihVar, View view, boolean z2, int i10) {
        zzdkk zzdkkVar = zzdihVar.zzo;
        if (zzdkkVar != null) {
            zzdihVar.zzf.zzq(view, zzdkkVar.zzf(), zzdihVar.zzo.zzl(), zzdihVar.zzo.zzm(), z2, zzdihVar.zzab(), i10);
        } else {
            int i11 = l0.f13401b;
            k.b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        }
    }

    public static /* synthetic */ void zzv(zzdih zzdihVar) {
        zzdihVar.zzf.zzk();
        zzdihVar.zze.zzI();
    }

    public final synchronized void zzA() {
        this.zzf.zzj();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[Catch: all -> 0x000a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d A[Catch: all -> 0x000a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzB(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzq     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Ld
            r3.zzad(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        La:
            r4 = move-exception
            goto L95
        Ld:
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.internal.ads.zzbdc.zzbU     // Catch: java.lang.Throwable -> La
            nc.t r1 = nc.t.f12227d     // Catch: java.lang.Throwable -> La
            com.google.android.gms.internal.ads.zzbda r1 = r1.f12230c     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r1.zzb(r0)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.zzfbt r0 = r3.zzb     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.zzak     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L48
            java.util.Map r0 = r3.zzz     // Catch: java.lang.Throwable -> La
            java.util.Set r1 = r0.keySet()     // Catch: java.lang.Throwable -> La
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La
        L2f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> La
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> La
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> La
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r2 != 0) goto L2f
            goto L8b
        L48:
            if (r7 != 0) goto L8d
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.internal.ads.zzbdc.zzef     // Catch: java.lang.Throwable -> La
            nc.t r0 = nc.t.f12227d     // Catch: java.lang.Throwable -> La
            com.google.android.gms.internal.ads.zzbda r0 = r0.f12230c     // Catch: java.lang.Throwable -> La
            java.lang.Object r7 = r0.zzb(r7)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> La
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r7 == 0) goto L8b
            if (r5 == 0) goto L8b
            java.util.Set r7 = r5.entrySet()     // Catch: java.lang.Throwable -> La
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> La
        L66:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> La
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> La
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> La
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L66
            boolean r0 = zzY(r0)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L66
            r3.zzae(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        L8b:
            monitor-exit(r3)
            return
        L8d:
            r3.zzae(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            r3.zzad(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        L95:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdih.zzB(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void zzC(s1 s1Var) {
        this.zzf.zzl(s1Var);
    }

    public final synchronized void zzD(View view, View view2, Map map, Map map2, boolean z2) {
        zzcfe zzcfeVarZzs;
        this.zzg.zzc(this.zzo);
        this.zzf.zzm(view, view2, map, map2, z2, zzab());
        if (this.zzs) {
            zzdim zzdimVar = this.zze;
            if (zzdimVar.zzs() != null && (zzcfeVarZzs = zzdimVar.zzs()) != null) {
                zzcfeVarZzs.zzd("onSdkAdUserInteractionClick", new q.e(0));
            }
        }
    }

    public final synchronized void zzE(final View view, final int i10) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlM)).booleanValue()) {
            zzdkk zzdkkVar = this.zzo;
            if (zzdkkVar == null) {
                int i11 = l0.f13401b;
                k.b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z2 = zzdkkVar instanceof zzdjg;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdib
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdih.zzu(this.zza, view, z2, i10);
                    }
                });
            }
        }
    }

    public final synchronized void zzF(String str) {
        this.zzf.zzn(str);
    }

    public final synchronized void zzG(Bundle bundle) {
        this.zzf.zzo(bundle);
    }

    public final synchronized void zzH() {
        zzdkk zzdkkVar = this.zzo;
        if (zzdkkVar == null) {
            int i10 = l0.f13401b;
            k.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z2 = zzdkkVar instanceof zzdjg;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdid
                @Override // java.lang.Runnable
                public final void run() {
                    zzdih.zzs(this.zza, z2);
                }
            });
        }
    }

    public final void zzI(Bundle bundle) throws JSONException {
        final zzcfe zzcfeVarZzs = this.zze.zzs();
        if (zzcfeVarZzs == null) {
            int i10 = l0.f13401b;
            k.d("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdia
                @Override // java.lang.Runnable
                public final void run() {
                    zzfyf zzfyfVar = zzdih.zzc;
                    zzcfeVarZzs.zze("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e10) {
            int i11 = l0.f13401b;
            k.e("Error reading event signals", e10);
        }
    }

    public final synchronized void zzJ() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzu();
    }

    public final void zzK(View view) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfB)).booleanValue()) {
            zzdim zzdimVar = this.zze;
            if (zzdimVar.zzc() != 3) {
                zzcai zzcaiVarZzp = zzdimVar.zzp();
                if (zzcaiVarZzp == null) {
                    return;
                }
                zzgdb.zzr(zzcaiVarZzp, new zzdig(this, view), this.zzd);
                return;
            }
        }
        zzaf(view, this.zze.zzu());
    }

    public final synchronized void zzL(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzv(view, motionEvent, view2);
    }

    public final synchronized void zzM(Bundle bundle) {
        this.zzf.zzw(bundle);
    }

    public final synchronized void zzN(View view) {
        this.zzf.zzx(view);
    }

    public final synchronized void zzO() {
        this.zzf.zzy();
    }

    public final synchronized void zzP(p1 p1Var) {
        this.zzf.zzz(p1Var);
    }

    public final synchronized void zzQ(a2 a2Var) {
        this.zzy.zza(a2Var);
    }

    public final synchronized void zzR(zzbie zzbieVar) {
        this.zzf.zzA(zzbieVar);
    }

    public final synchronized void zzS(final zzdkk zzdkkVar) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzbS)).booleanValue()) {
            r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhw
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzag(zzdkkVar);
                }
            });
        } else {
            zzag(zzdkkVar);
        }
    }

    public final synchronized void zzT(final zzdkk zzdkkVar) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzbS)).booleanValue()) {
            r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhx
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzah(zzdkkVar);
                }
            });
        } else {
            zzah(zzdkkVar);
        }
    }

    public final boolean zzU() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzV() {
        return this.zzf.zzD();
    }

    public final synchronized boolean zzW() {
        return this.zzf.zzE();
    }

    public final boolean zzX() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzZ(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zZzF = this.zzf.zzF(bundle);
        this.zzq = zZzF;
        return zZzF;
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdic
            @Override // java.lang.Runnable
            public final void run() {
                zzdih.zzv(this.zza);
            }
        });
        super.zzb();
    }

    public final zzdij zzc() {
        return this.zzx;
    }

    public final zzecz zzf(String str, boolean z2) {
        boolean z10;
        boolean z11;
        String str2;
        zzecv zzecvVar;
        zzecw zzecwVar;
        zzdir zzdirVar = this.zzh;
        if (zzdirVar.zzd() && !TextUtils.isEmpty(str)) {
            zzdim zzdimVar = this.zze;
            zzcfe zzcfeVarZzr = zzdimVar.zzr();
            zzcfe zzcfeVarZzs = zzdimVar.zzs();
            if (zzcfeVarZzr == null && zzcfeVarZzs == null) {
                int i10 = l0.f13401b;
                k.g("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            zzdirVar.zza();
            int iZzc = zzdirVar.zza().zzc();
            int i11 = iZzc - 1;
            if (i11 != 0) {
                if (i11 != 1) {
                    String strJ = m1.j("Unknown omid media type: ", iZzc != 1 ? iZzc != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO", ". Not initializing Omid.");
                    int i12 = l0.f13401b;
                    k.g(strJ);
                    return null;
                }
                if (zzcfeVarZzr == null) {
                    int i13 = l0.f13401b;
                    k.g("Omid media type was display but there was no display webview.");
                    return null;
                }
                z11 = false;
                z10 = true;
            } else if (zzcfeVarZzs != null) {
                z10 = false;
                z11 = true;
            } else {
                int i14 = l0.f13401b;
                k.g("Omid media type was video but there was no video webview.");
            }
            if (z10) {
                str2 = null;
            } else {
                str2 = "javascript";
                zzcfeVarZzr = zzcfeVarZzs;
            }
            if (zzcfeVarZzr == null) {
                int i15 = l0.f13401b;
                k.g("Webview is null in InternalNativeAd");
                return null;
            }
            Context context = this.zzw;
            n nVar = n.D;
            zzect zzectVar = nVar.f11598y;
            zzect zzectVar2 = nVar.f11598y;
            if (!zzectVar.zzl(context)) {
                int i16 = l0.f13401b;
                k.g("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            rc.a aVar = this.zzv;
            String str3 = aVar.f14322b + "." + aVar.f14323c;
            if (z11) {
                zzecvVar = zzecv.VIDEO;
                zzecwVar = zzecw.DEFINED_BY_JAVASCRIPT;
            } else {
                zzecvVar = zzecv.NATIVE_DISPLAY;
                zzecwVar = zzdimVar.zzc() == 3 ? zzecw.UNSPECIFIED : zzecw.ONE_PIXEL;
            }
            zzecz zzeczVarZzb = nVar.f11598y.zzb(str3, zzcfeVarZzr.zzG(), "", "javascript", str2, str, zzecwVar, zzecvVar, this.zzb.zzal);
            if (zzeczVarZzb == null) {
                int i17 = l0.f13401b;
                k.g("Failed to create omid session in InternalNativeAd");
                return null;
            }
            zzdimVar.zzW(zzeczVarZzb);
            zzcfeVarZzr.zzat(zzeczVarZzb);
            if (z11) {
                zzfld zzfldVarZza = zzeczVarZzb.zza();
                if (zzcfeVarZzs != null) {
                    zzectVar2.zzj(zzfldVarZza, zzcfeVarZzs.zzF());
                }
                this.zzs = true;
            }
            if (z2) {
                zzectVar2.zzk(zzeczVarZzb.zza());
                zzcfeVarZzr.zzd("onSdkLoaded", new q.e(0));
            }
            return zzeczVarZzb;
        }
        return null;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzab());
    }

    public final synchronized JSONObject zzj(View view, Map map, Map map2) {
        return this.zzf.zzg(view, map, map2, zzab());
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final void zzk() {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhy
            @Override // java.lang.Runnable
            public final void run() {
                zzdih.zzt(this.zza);
            }
        };
        Executor executor = this.zzd;
        executor.execute(runnable);
        if (this.zze.zzc() != 7) {
            final zzdiu zzdiuVar = this.zzf;
            Objects.requireNonNull(zzdiuVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhz
                @Override // java.lang.Runnable
                public final void run() {
                    zzdiuVar.zzs();
                }
            });
        }
        super.zzk();
    }

    public final void zzz(View view) {
        zzecz zzeczVarZzu = this.zze.zzu();
        if (!this.zzh.zzd() || zzeczVarZzu == null || view == null) {
            return;
        }
        n.D.f11598y.zzg(zzeczVarZzu.zza(), view);
    }
}
