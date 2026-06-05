package v;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17205a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17206b;

    /* renamed from: c, reason: collision with root package name */
    public long f17207c = 0;

    /* renamed from: d, reason: collision with root package name */
    public EdgeEffect f17208d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f17209e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f17210f;

    /* renamed from: g, reason: collision with root package name */
    public EdgeEffect f17211g;

    /* renamed from: h, reason: collision with root package name */
    public EdgeEffect f17212h;

    /* renamed from: i, reason: collision with root package name */
    public EdgeEffect f17213i;
    public EdgeEffect j;

    /* renamed from: k, reason: collision with root package name */
    public EdgeEffect f17214k;

    public h0(Context context, int i10) {
        this.f17205a = context;
        this.f17206b = i10;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? l.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a(x.o1 o1Var) {
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f17205a;
        EdgeEffect edgeEffectA = i10 >= 31 ? l.a(context) : new n0(context);
        edgeEffectA.setColor(this.f17206b);
        if (!s3.l.b(this.f17207c, 0L)) {
            if (o1Var == x.o1.f19664a) {
                long j = this.f17207c;
                edgeEffectA.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return edgeEffectA;
            }
            long j4 = this.f17207c;
            edgeEffectA.setSize((int) (j4 & 4294967295L), (int) (j4 >> 32));
        }
        return edgeEffectA;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f17209e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(x.o1.f19664a);
        this.f17209e = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f17210f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(x.o1.f19665b);
        this.f17210f = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f17211g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(x.o1.f19665b);
        this.f17211g = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f17208d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(x.o1.f19664a);
        this.f17208d = edgeEffectA;
        return edgeEffectA;
    }
}
