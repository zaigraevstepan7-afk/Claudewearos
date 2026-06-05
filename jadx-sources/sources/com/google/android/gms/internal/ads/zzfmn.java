package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfmn implements zzfml {
    private final zzfml zza;

    public zzfmn(zzfml zzfmlVar) {
        this.zza = zzfmlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfml
    public final JSONObject zza(View view) throws JSONException {
        JSONObject jSONObjectZza = zzfmv.zza(0, 0, 0, 0);
        int iZzb = zzfmy.zzb();
        int i10 = iZzb - 1;
        if (iZzb == 0) {
            throw null;
        }
        try {
            jSONObjectZza.put("noOutputDevice", i10 == 0);
            return jSONObjectZza;
        } catch (JSONException e10) {
            zzfmw.zza("Error with setting output device status", e10);
            return jSONObjectZza;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfml
    public final void zzb(View view, JSONObject jSONObject, zzfmk zzfmkVar, boolean z2, boolean z10) {
        ArrayList arrayList = new ArrayList();
        zzflz zzflzVarZza = zzflz.zza();
        if (zzflzVarZza != null) {
            Collection collectionZzb = zzflzVarZza.zzb();
            int size = collectionZzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionZzb.iterator();
            while (it.hasNext()) {
                View viewZzf = ((zzflh) it.next()).zzf();
                if (viewZzf != null && viewZzf.isAttachedToWindow() && viewZzf.isShown()) {
                    View view2 = viewZzf;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewZzf.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z11 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i10 = size2 - 1;
                                    if (((View) arrayList.get(i10)).getZ() <= z11) {
                                        break;
                                    } else {
                                        size2 = i10;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i11 = 0; i11 < size3; i11++) {
            zzfmkVar.zza((View) arrayList.get(i11), this.zza, jSONObject, z10);
        }
    }
}
