package v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1 f17189a;

    /* renamed from: b, reason: collision with root package name */
    public static final f1 f17190b;

    /* renamed from: c, reason: collision with root package name */
    public static final f1 f17191c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f1[] f17192d;

    static {
        f1 f1Var = new f1("Default", 0);
        f17189a = f1Var;
        f1 f1Var2 = new f1("UserInput", 1);
        f17190b = f1Var2;
        f1 f1Var3 = new f1("PreventUserInput", 2);
        f17191c = f1Var3;
        f1[] f1VarArr = {f1Var, f1Var2, f1Var3};
        f17192d = f1VarArr;
        u0.c.j(f1VarArr);
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) f17192d.clone();
    }
}
