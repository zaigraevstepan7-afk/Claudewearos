package t6;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public int f16079a;

    /* renamed from: b, reason: collision with root package name */
    public int f16080b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16081c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16082d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16083e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f16084f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f16085g;

    public x0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f16085g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f16079a = -1;
        this.f16080b = Integer.MIN_VALUE;
        this.f16081c = false;
        this.f16082d = false;
        this.f16083e = false;
        int[] iArr = this.f16084f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
