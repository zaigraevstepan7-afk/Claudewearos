package vi;

import fj.l;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a implements ti.c, d, Serializable {
    private final ti.c completion;

    public a(ti.c cVar) {
        this.completion = cVar;
    }

    public ti.c create(ti.c cVar) {
        l.f(cVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        ti.c cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public final ti.c getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null || eVar.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i10 = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        hk.c cVar = f.f18080b;
        hk.c cVar2 = f.f18079a;
        if (cVar == null) {
            try {
                hk.c cVar3 = new hk.c(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f18080b = cVar3;
                cVar = cVar3;
            } catch (Exception unused2) {
                f.f18080b = cVar2;
                cVar = cVar2;
            }
        }
        if (cVar != cVar2 && (method = cVar.f8023a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = cVar.f8024b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = cVar.f8025c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i10);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // ti.c
    public final void resumeWith(Object obj) {
        ti.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            ti.c cVar2 = aVar.completion;
            l.c(cVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == ui.a.f17085a) {
                    return;
                }
            } catch (Throwable th2) {
                obj = uk.c.r(th2);
            }
            aVar.releaseIntercepted();
            if (!(cVar2 instanceof a)) {
                cVar2.resumeWith(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public ti.c create(Object obj, ti.c cVar) {
        l.f(cVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
