package qc;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final String f13353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f13354b;

    public f0(g0 g0Var, String str) {
        this.f13354b = g0Var;
        this.f13353a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        g0 g0Var = this.f13354b;
        synchronized (g0Var) {
            try {
                ArrayList arrayList = g0Var.f13362b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    String str2 = this.f13353a;
                    HashMap map = ((e0) obj).f13349a;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        ((o0) mc.n.D.f11582h.zzi()).d(false);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
