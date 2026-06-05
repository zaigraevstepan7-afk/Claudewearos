package kd;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c f9533b = new c(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9534a;

    public /* synthetic */ c(int i10) {
        this.f9534a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f9534a) {
        }
        return ((Scope) obj).f3487b.compareTo(((Scope) obj2).f3487b);
    }
}
