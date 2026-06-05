package v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f17575a;

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f17576b;

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f17577c;

    /* renamed from: d, reason: collision with root package name */
    public static final b0 f17578d;

    /* renamed from: e, reason: collision with root package name */
    public static final b0 f17579e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b0[] f17580f;

    static {
        b0 b0Var = new b0("Measuring", 0);
        f17575a = b0Var;
        b0 b0Var2 = new b0("LookaheadMeasuring", 1);
        f17576b = b0Var2;
        b0 b0Var3 = new b0("LayingOut", 2);
        f17577c = b0Var3;
        b0 b0Var4 = new b0("LookaheadLayingOut", 3);
        f17578d = b0Var4;
        b0 b0Var5 = new b0("Idle", 4);
        f17579e = b0Var5;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3, b0Var4, b0Var5};
        f17580f = b0VarArr;
        u0.c.j(b0VarArr);
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f17580f.clone();
    }
}
