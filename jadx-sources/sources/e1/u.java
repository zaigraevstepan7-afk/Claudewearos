package e1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f5669a;

    /* renamed from: b, reason: collision with root package name */
    public static final u f5670b;

    /* renamed from: c, reason: collision with root package name */
    public static final u f5671c;

    /* renamed from: d, reason: collision with root package name */
    public static final u f5672d;

    /* renamed from: e, reason: collision with root package name */
    public static final u f5673e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ u[] f5674f;

    static {
        u uVar = new u("DefaultSpatial", 0);
        f5669a = uVar;
        u uVar2 = new u("FastSpatial", 1);
        f5670b = uVar2;
        u uVar3 = new u("SlowSpatial", 2);
        u uVar4 = new u("DefaultEffects", 3);
        f5671c = uVar4;
        u uVar5 = new u("FastEffects", 4);
        f5672d = uVar5;
        u uVar6 = new u("SlowEffects", 5);
        f5673e = uVar6;
        u[] uVarArr = {uVar, uVar2, uVar3, uVar4, uVar5, uVar6};
        f5674f = uVarArr;
        u0.c.j(uVarArr);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f5674f.clone();
    }
}
