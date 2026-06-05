package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import mc.n;
import nc.t;
import qc.l0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdtk extends zzble {
    private final zzdtn zza;
    private final zzdti zzb;
    private final Map zzc = new HashMap();

    public zzdtk(zzdtn zzdtnVar, zzdti zzdtiVar) {
        this.zza = zzdtnVar;
        this.zzb = zzdtiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static nc.q3 zzc(java.util.Map r37) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdtk.zzc(java.util.Map):nc.q3");
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zze() {
        this.zzc.clear();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zzf(String str) throws NumberFormatException {
        zzbct zzbctVar = zzbdc.zzkh;
        t tVar = t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        if (((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue()) {
            l0.k("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri uri = Uri.parse(str);
            r0 r0Var = n.D.f11577c;
            HashMap mapM = r0.m(uri);
            String str2 = (String) mapM.get("action");
            if (TextUtils.isEmpty(str2)) {
                k.b("H5 gmsg did not contain an action");
                return;
            }
            int iHashCode = str2.hashCode();
            if (iHashCode != 579053441) {
                if (iHashCode == 871091088 && str2.equals("initialize")) {
                    this.zzc.clear();
                    this.zzb.zza();
                    return;
                }
            } else if (str2.equals("dispose_all")) {
                Map map = this.zzc;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzdtd) it.next()).zza();
                }
                map.clear();
                return;
            }
            String str3 = (String) mapM.get("obj_id");
            try {
                Objects.requireNonNull(str3);
                long j = Long.parseLong(str3);
                switch (str2.hashCode()) {
                    case -1790951212:
                        if (str2.equals("show_interstitial_ad")) {
                            zzdtd zzdtdVar = (zzdtd) this.zzc.get(Long.valueOf(j));
                            if (zzdtdVar != null) {
                                zzdtdVar.zzc();
                                return;
                            } else {
                                k.b("Could not show H5 ad, object ID does not exist");
                                this.zzb.zzf(j);
                                return;
                            }
                        }
                        break;
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            zzdtd zzdtdVar2 = (zzdtd) this.zzc.get(Long.valueOf(j));
                            if (zzdtdVar2 != null) {
                                zzdtdVar2.zzc();
                                return;
                            } else {
                                k.b("Could not show H5 ad, object ID does not exist");
                                this.zzb.zzq(j);
                                return;
                            }
                        }
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            zzdtd zzdtdVar3 = (zzdtd) this.zzc.get(Long.valueOf(j));
                            if (zzdtdVar3 != null) {
                                zzdtdVar3.zzb(zzc(mapM));
                                return;
                            } else {
                                k.b("Could not load H5 ad, object ID does not exist");
                                this.zzb.zzq(j);
                                return;
                            }
                        }
                        break;
                    case 393881811:
                        if (str2.equals("create_interstitial_ad")) {
                            Map map2 = this.zzc;
                            if (map2.size() >= ((Integer) zzbdaVar2.zzb(zzbdc.zzki)).intValue()) {
                                k.g("Could not create H5 ad, too many existing objects");
                                this.zzb.zzi(j);
                                return;
                            }
                            Long lValueOf = Long.valueOf(j);
                            if (map2.containsKey(lValueOf)) {
                                k.b("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(j);
                                return;
                            }
                            String str4 = (String) mapM.get("ad_unit");
                            if (TextUtils.isEmpty(str4)) {
                                k.g("Could not create H5 ad, missing ad unit id");
                                this.zzb.zzi(j);
                                return;
                            }
                            zzdte zzdteVarZzb = this.zza.zzb();
                            zzdteVarZzb.zzb(j);
                            zzdteVarZzb.zza(str4);
                            map2.put(lValueOf, zzdteVarZzb.zzc().zza());
                            this.zzb.zzh(j);
                            l0.k("Created H5 interstitial #" + j + " with ad unit " + str4);
                            return;
                        }
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            zzdtd zzdtdVar4 = (zzdtd) this.zzc.get(Long.valueOf(j));
                            if (zzdtdVar4 != null) {
                                zzdtdVar4.zzb(zzc(mapM));
                                return;
                            } else {
                                k.b("Could not load H5 ad, object ID does not exist");
                                this.zzb.zzf(j);
                                return;
                            }
                        }
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            Map map3 = this.zzc;
                            Long lValueOf2 = Long.valueOf(j);
                            zzdtd zzdtdVar5 = (zzdtd) map3.get(lValueOf2);
                            if (zzdtdVar5 == null) {
                                k.b("Could not dispose H5 ad, object ID does not exist");
                                return;
                            }
                            zzdtdVar5.zza();
                            map3.remove(lValueOf2);
                            l0.k("Disposed H5 ad #" + j);
                            return;
                        }
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            Map map4 = this.zzc;
                            if (map4.size() >= ((Integer) zzbdaVar2.zzb(zzbdc.zzki)).intValue()) {
                                k.g("Could not create H5 ad, too many existing objects");
                                this.zzb.zzi(j);
                                return;
                            }
                            Long lValueOf3 = Long.valueOf(j);
                            if (map4.containsKey(lValueOf3)) {
                                k.b("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(j);
                                return;
                            }
                            String str5 = (String) mapM.get("ad_unit");
                            if (TextUtils.isEmpty(str5)) {
                                k.g("Could not create H5 ad, missing ad unit id");
                                this.zzb.zzi(j);
                                return;
                            }
                            zzdte zzdteVarZzb2 = this.zza.zzb();
                            zzdteVarZzb2.zzb(j);
                            zzdteVarZzb2.zza(str5);
                            map4.put(lValueOf3, zzdteVarZzb2.zzc().zzb());
                            this.zzb.zzh(j);
                            l0.k("Created H5 rewarded #" + j + " with ad unit " + str5);
                            return;
                        }
                        break;
                }
                k.b("H5 gmsg contained invalid action: ".concat(str2));
            } catch (NullPointerException | NumberFormatException unused) {
                k.b("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }
}
