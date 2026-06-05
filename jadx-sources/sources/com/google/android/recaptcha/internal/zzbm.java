package com.google.android.recaptcha.internal;

import android.content.Context;
import fj.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import mk.b;
import qi.r;
import qj.b0;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzbm implements zzbh {
    public static final zzbi zza = new zzbi(null);
    private static Timer zzb;
    private final zzbn zzc;
    private final z zzd;
    private final zzaz zze;

    /* JADX WARN: Multi-variable type inference failed */
    public zzbm(Context context, zzbn zzbnVar, z zVar) {
        this.zzc = zzbnVar;
        this.zzd = zVar;
        zzaz zzazVar = null;
        Object[] objArr = 0;
        try {
            zzaz zzazVar2 = zzaz.zzc;
            zzazVar2 = zzazVar2 == null ? new zzaz(context, objArr == true ? 1 : 0) : zzazVar2;
            zzaz.zzc = zzazVar2;
            zzazVar = zzazVar2;
        } catch (Exception unused) {
        }
        this.zze = zzazVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        ArrayList arrayList;
        zzaz zzazVar;
        zzpd zzpdVarZzk;
        int iZzJ;
        int i10;
        zzaz zzazVar2 = this.zze;
        if (zzazVar2 != null) {
            List listZzd = zzazVar2.zzd();
            l.f(listZzd, "<this>");
            int i11 = 0;
            if (listZzd instanceof RandomAccess) {
                int size = listZzd.size();
                arrayList = new ArrayList((size / 20) + (size % 20 == 0 ? 0 : 1));
                for (int i12 = 0; i12 >= 0 && i12 < size; i12 += 20) {
                    int i13 = size - i12;
                    if (20 <= i13) {
                        i13 = 20;
                    }
                    ArrayList arrayList2 = new ArrayList(i13);
                    for (int i14 = 0; i14 < i13; i14++) {
                        arrayList2.add(listZzd.get(i14 + i12));
                    }
                    arrayList.add(arrayList2);
                }
            } else {
                arrayList = new ArrayList();
                Iterator it = listZzd.iterator();
                l.f(it, "iterator");
                Iterator itY = !it.hasNext() ? r.f13519a : b.y(new qi.z(it, null));
                while (itY.hasNext()) {
                    arrayList.add((List) itY.next());
                }
            }
            int size2 = arrayList.size();
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                zznh zznhVarZzi = zzni.zzi();
                ArrayList arrayList3 = new ArrayList();
                for (zzba zzbaVar : (List) obj) {
                    try {
                        zzpdVarZzk = zzpd.zzk(zzfy.zzg().zzj(zzbaVar.zzc()));
                        iZzJ = zzpdVarZzk.zzJ();
                        i10 = iZzJ - 1;
                    } catch (Exception unused) {
                        zzaz zzazVar3 = this.zze;
                        if (zzazVar3 != null) {
                            zzazVar3.zzf(zzbaVar);
                        }
                    }
                    if (iZzJ == 0) {
                        throw null;
                    }
                    if (i10 == 0) {
                        zznhVarZzi.zzp(zzpdVarZzk.zzf());
                    } else if (i10 == 1) {
                        zznhVarZzi.zzq(zzpdVarZzk.zzg());
                    }
                    arrayList3.add(zzbaVar);
                }
                if (zznhVarZzi.zze() + zznhVarZzi.zzd() != 0) {
                    if (this.zzc.zza(((zzni) zznhVarZzi.zzj()).zzd()) && (zzazVar = this.zze) != null) {
                        zzazVar.zza(arrayList3);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zzb == null) {
            Timer timer = new Timer();
            zzb = timer;
            timer.schedule(new zzbj(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzbh
    public final void zza(zzpd zzpdVar) {
        b0.w(this.zzd, null, new zzbl(this, zzpdVar, null), 3);
        zzh();
    }
}
