package nc;

import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbmj;
import com.google.android.gms.internal.ads.zzbmk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u2 extends zzbmh {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v2 f12240a;

    public /* synthetic */ u2(v2 v2Var) {
        this.f12240a = v2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzb(List list) {
        ArrayList arrayList;
        v2 v2Var = this.f12240a;
        synchronized (v2Var.f12249a) {
            v2Var.f12251c = false;
            v2Var.f12252d = true;
            arrayList = new ArrayList(v2Var.f12250b);
            v2Var.f12250b.clear();
        }
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbmb zzbmbVar = (zzbmb) it.next();
            map.put(zzbmbVar.zza, new zzbmj(zzbmbVar.zzb ? lc.a.f10896b : lc.a.f10895a, zzbmbVar.zzd, zzbmbVar.zzc));
        }
        new zzbmk(map);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }
}
