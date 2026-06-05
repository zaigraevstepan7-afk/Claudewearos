package cb;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m implements GLSurfaceView.Renderer {
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final FloatBuffer J;
    public final FloatBuffer K;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3194a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f3195b;

    /* renamed from: c, reason: collision with root package name */
    public int f3196c;

    /* renamed from: d, reason: collision with root package name */
    public int f3197d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3198e;

    /* renamed from: f, reason: collision with root package name */
    public int f3199f;

    /* renamed from: g, reason: collision with root package name */
    public int f3200g;

    /* renamed from: h, reason: collision with root package name */
    public int f3201h;

    /* renamed from: i, reason: collision with root package name */
    public int f3202i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f3203k;

    /* renamed from: l, reason: collision with root package name */
    public int f3204l;

    /* renamed from: m, reason: collision with root package name */
    public int f3205m;

    /* renamed from: n, reason: collision with root package name */
    public int f3206n;

    /* renamed from: o, reason: collision with root package name */
    public int f3207o;

    /* renamed from: p, reason: collision with root package name */
    public int f3208p;

    /* renamed from: q, reason: collision with root package name */
    public int f3209q;

    /* renamed from: r, reason: collision with root package name */
    public int f3210r;

    /* renamed from: s, reason: collision with root package name */
    public int f3211s;

    /* renamed from: t, reason: collision with root package name */
    public int f3212t;

    /* renamed from: u, reason: collision with root package name */
    public float f3213u;

    /* renamed from: v, reason: collision with root package name */
    public float f3214v;

    /* renamed from: w, reason: collision with root package name */
    public float f3215w;

    /* renamed from: x, reason: collision with root package name */
    public float f3216x;

    /* renamed from: y, reason: collision with root package name */
    public float f3217y;

    /* renamed from: z, reason: collision with root package name */
    public float f3218z;

    public m(Context context, Bitmap bitmap) {
        fj.l.f(context, "context");
        this.f3194a = context;
        this.f3195b = bitmap;
        this.f3198e = System.currentTimeMillis();
        this.f3213u = 0.4f;
        this.f3214v = 0.25f;
        this.f3215w = 0.8f;
        this.f3216x = 0.5f;
        this.f3217y = 2.61f;
        this.f3218z = 0.5f;
        this.A = 16;
        this.C = true;
        this.E = true;
        this.F = 1;
        this.G = 1;
        this.H = 1920;
        this.I = 1080;
        FloatBuffer floatBufferPut = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer().put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferPut.position(0);
        this.J = floatBufferPut;
        FloatBuffer floatBufferPut2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer().put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        floatBufferPut2.position(0);
        this.K = floatBufferPut2;
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15, int i10, boolean z2, boolean z10, boolean z11, boolean z12) {
        this.f3213u = f10;
        this.f3214v = f11;
        this.f3215w = f12;
        this.f3216x = f13;
        this.f3217y = f14;
        this.f3218z = f15;
        this.A = i10;
        this.B = z2;
        this.C = z10;
        this.D = z11;
        this.E = z12;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16384);
        GLES20.glUseProgram(this.f3196c);
        GLES20.glUniform1f(this.f3199f, (System.currentTimeMillis() - this.f3198e) / 1000.0f);
        GLES20.glUniform2f(this.f3200g, this.F, this.G);
        GLES20.glUniform2f(this.f3202i, this.H, this.I);
        GLES20.glUniform1f(this.j, this.f3213u);
        GLES20.glUniform1f(this.f3203k, this.f3214v);
        GLES20.glUniform1f(this.f3204l, this.f3215w);
        GLES20.glUniform1f(this.f3205m, this.f3216x);
        GLES20.glUniform1f(this.f3206n, this.f3217y);
        GLES20.glUniform1f(this.f3207o, this.f3218z);
        GLES20.glUniform1i(this.f3208p, this.A);
        GLES20.glUniform1i(this.f3209q, this.D ? 1 : 0);
        GLES20.glUniform1i(this.f3210r, this.C ? 1 : 0);
        GLES20.glUniform1i(this.f3211s, this.B ? 1 : 0);
        GLES20.glUniform1i(this.f3212t, this.E ? 1 : 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f3197d);
        GLES20.glUniform1i(this.f3201h, 0);
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f3196c, "a_position");
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.f3196c, "a_texCoord");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 2, 5126, false, 0, (Buffer) this.J);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation2);
        GLES20.glVertexAttribPointer(iGlGetAttribLocation2, 2, 5126, false, 0, (Buffer) this.K);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(iGlGetAttribLocation);
        GLES20.glDisableVertexAttribArray(iGlGetAttribLocation2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
        this.F = i10;
        this.G = i11;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) throws IOException {
        Bitmap bitmapCreateBitmap;
        Bitmap bitmapCreateBitmap2;
        Drawable drawable;
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        int iGlCreateShader = GLES20.glCreateShader(35633);
        GLES20.glShaderSource(iGlCreateShader, "\n            attribute vec4 a_position;\n            attribute vec2 a_texCoord;\n            varying vec2 vUv;\n            \n            void main() {\n                vUv = a_texCoord;\n                gl_Position = a_position;\n            }\n        ");
        GLES20.glCompileShader(iGlCreateShader);
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        GLES20.glShaderSource(iGlCreateShader2, "\n            precision highp float;\n            \n            varying vec2 vUv;\n            uniform sampler2D u_tex0;\n            uniform vec2 u_tex0_resolution;\n            uniform float u_time;\n            uniform vec2 u_resolution;\n            uniform float u_speed;\n            uniform float u_intensity;\n            uniform float u_normal;\n            uniform float u_brightness;\n            uniform float u_blur_intensity;\n            uniform float u_zoom;\n            uniform int u_blur_iterations;\n            uniform bool u_panning;\n            uniform bool u_post_processing;\n            uniform bool u_lightning;\n            uniform bool u_texture_fill;\n            \n            #define S(a, b, t) smoothstep(a, b, t)\n            \n            vec3 N13(float p) {\n                vec3 p3 = fract(vec3(p) * vec3(.1031, .11369, .13787));\n                p3 += dot(p3, p3.yzx + 19.19);\n                return fract(vec3((p3.x + p3.y) * p3.z, (p3.x + p3.z) * p3.y, (p3.y + p3.z) * p3.x));\n            }\n            \n            float N(float t) {\n                return fract(sin(t * 12345.564) * 7658.76);\n            }\n            \n            float Saw(float b, float t) {\n                return S(0., b, t) * S(1., b, t);\n            }\n            \n            vec2 DropLayer2(vec2 uv, float t) {\n                vec2 UV = uv;\n                uv.y += t * 0.75;\n                vec2 a = vec2(6., 1.);\n                vec2 grid = a * 2.;\n                vec2 id = floor(uv * grid);\n                \n                float colShift = N(id.x);\n                uv.y += colShift;\n                \n                id = floor(uv * grid);\n                vec3 n = N13(id.x * 35.2 + id.y * 2376.1);\n                vec2 st = fract(uv * grid) - vec2(.5, 0);\n                \n                float x = n.x - .5;\n                float y = UV.y * 20.;\n                float wiggle = sin(y + sin(y));\n                x += wiggle * (.5 - abs(x)) * (n.z - .5);\n                x *= .7;\n                float ti = fract(t + n.z);\n                y = (Saw(.85, ti) - .5) * .9 + .5;\n                vec2 p = vec2(x, y);\n                \n                float d = length((st - p) * a.yx);\n                float mainDrop = S(.4, .0, d);\n                \n                float r = sqrt(S(1., y, st.y));\n                float cd = abs(st.x - x);\n                float trail = S(.23 * r, .15 * r * r, cd);\n                float trailFront = S(-.02, .02, st.y - y);\n                trail *= trailFront * r * r;\n                \n                y = UV.y;\n                float trail2 = S(.2 * r, .0, cd);\n                float droplets = max(0., (sin(y * (1. - y) * 120.) - st.y)) * trail2 * trailFront * n.z;\n                y = fract(y * 10.) + (st.y - .5);\n                float dd = length(st - vec2(x, y));\n                droplets = S(.3, 0., dd);\n                float m = mainDrop + droplets * r * trailFront;\n                \n                return vec2(m, trail);\n            }\n            \n            float StaticDrops(vec2 uv, float t) {\n                uv *= 40.;\n                vec2 id = floor(uv);\n                uv = fract(uv) - .5;\n                vec3 n = N13(id.x * 107.45 + id.y * 3543.654);\n                vec2 p = (n.xy - .5) * .7;\n                float d = length(uv - p);\n                float fade = Saw(.025, fract(t + n.z));\n                float c = S(.3, 0., d) * fract(n.z * 10.) * fade;\n                return c;\n            }\n            \n            vec2 Drops(vec2 uv, float t, float l0, float l1, float l2) {\n                float s = StaticDrops(uv, t) * l0;\n                vec2 m1 = DropLayer2(uv, t) * l1;\n                vec2 m2 = DropLayer2(uv * 1.85, t) * l2;\n                \n                float c = s + m1.x + m2.x;\n                c = S(.3, 1., c);\n                \n                return vec2(c, max(m1.y * l0, m2.y * l1));\n            }\n            \n            float N21(vec2 p) {\n                p = fract(p * vec2(123.34, 345.45));\n                p += dot(p, p + 34.345);\n                return fract(p.x * p.y);\n            }\n            \n            void main() {\n                vec2 uv = (gl_FragCoord.xy - .5 * u_resolution.xy) / u_resolution.y;\n                vec2 UV = gl_FragCoord.xy / u_resolution.xy;\n                UV.y = 1.0 - UV.y; // Flip Y coordinate for correct orientation\n                float T = u_time;\n                \n                if(u_texture_fill) {\n                    float screenAspect = u_resolution.x / u_resolution.y;\n                    float textureAspect = u_tex0_resolution.x / u_tex0_resolution.y;\n                    float scaleX = 1., scaleY = 1.;\n                    if(textureAspect > screenAspect)\n                        scaleX = screenAspect / textureAspect;\n                    else\n                        scaleY = textureAspect / screenAspect;\n                    UV = vec2(scaleX, scaleY) * (UV - 0.5) + 0.5;\n                }\n                \n                float t = T * .2 * u_speed;\n                float rainAmount = u_intensity;\n                float zoom = u_panning ? -cos(T * .2) : 0.;\n                uv *= (.7 + zoom * .3) * u_zoom;\n                \n                float staticDrops = S(-.5, 1., rainAmount) * 2.;\n                float layer1 = S(.25, .75, rainAmount);\n                float layer2 = S(.0, .5, rainAmount);\n                \n                vec2 c = Drops(uv, t, staticDrops, layer1, layer2);\n                \n                vec2 e = vec2(.001, 0.) * u_normal;\n                float cx = Drops(uv + e, t, staticDrops, layer1, layer2).x;\n                float cy = Drops(uv + e.yx, t, staticDrops, layer1, layer2).x;\n                vec2 n = vec2(cx - c.x, cy - c.x);\n                \n                vec3 col = texture2D(u_tex0, UV + n).rgb;\n                vec4 texCoord = vec4(UV.x + n.x, UV.y + n.y, 0, 1.0 * 25. * 0.01 / 7.);\n                \n                if(u_blur_iterations != 1) {\n                    float blur = u_blur_intensity * 0.01;\n                    float a = N21(gl_FragCoord.xy) * 6.2831;\n                    for(int m = 0; m < 64; m++) {\n                        if(m >= u_blur_iterations) break;\n                        vec2 offs = vec2(sin(a), cos(a)) * blur;\n                        float d = fract(sin((float(m) + 1.) * 546.) * 5424.);\n                        d = sqrt(d);\n                        offs *= d;\n                        col += texture2D(u_tex0, texCoord.xy + vec2(offs.x, offs.y)).xyz;\n                        a += 1.0;\n                    }\n                    col /= float(u_blur_iterations);\n                }\n                \n                t = (T + 3.) * .5;\n                if(u_post_processing) {\n                    col *= mix(vec3(1.), vec3(.8, .9, 1.3), 1.);\n                }\n                \n                float fade = S(0., 10., T);\n                \n                if(u_lightning) {\n                    float lightning = sin(t * sin(t * 10.));\n                    lightning *= pow(max(0., sin(t + sin(t))), 10.);\n                    col *= 1. + lightning * fade * mix(1., .1, 0.);\n                }\n                \n                col *= 1. - dot(UV -= .5, UV) * 1.;\n                \n                gl_FragColor = vec4(col * u_brightness, 1.0);\n            }\n        ");
        GLES20.glCompileShader(iGlCreateShader2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f3196c = iGlCreateProgram;
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
        GLES20.glAttachShader(this.f3196c, iGlCreateShader2);
        GLES20.glLinkProgram(this.f3196c);
        this.f3199f = GLES20.glGetUniformLocation(this.f3196c, "u_time");
        this.f3200g = GLES20.glGetUniformLocation(this.f3196c, "u_resolution");
        this.f3201h = GLES20.glGetUniformLocation(this.f3196c, "u_tex0");
        this.f3202i = GLES20.glGetUniformLocation(this.f3196c, "u_tex0_resolution");
        this.j = GLES20.glGetUniformLocation(this.f3196c, "u_intensity");
        this.f3203k = GLES20.glGetUniformLocation(this.f3196c, "u_speed");
        this.f3204l = GLES20.glGetUniformLocation(this.f3196c, "u_brightness");
        this.f3205m = GLES20.glGetUniformLocation(this.f3196c, "u_normal");
        this.f3206n = GLES20.glGetUniformLocation(this.f3196c, "u_zoom");
        this.f3207o = GLES20.glGetUniformLocation(this.f3196c, "u_blur_intensity");
        this.f3208p = GLES20.glGetUniformLocation(this.f3196c, "u_blur_iterations");
        this.f3209q = GLES20.glGetUniformLocation(this.f3196c, "u_panning");
        this.f3210r = GLES20.glGetUniformLocation(this.f3196c, "u_post_processing");
        this.f3211s = GLES20.glGetUniformLocation(this.f3196c, "u_lightning");
        this.f3212t = GLES20.glGetUniformLocation(this.f3196c, "u_texture_fill");
        Context context = this.f3194a;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        if (iArr[0] != 0) {
            Bitmap bitmap = this.f3195b;
            if (bitmap != null) {
                bitmapCreateBitmap = bitmap;
            } else {
                try {
                    drawable = WallpaperManager.getInstance(context).getDrawable();
                } catch (Exception unused) {
                }
                if (drawable != null) {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int i10 = 2048;
                    if (intrinsicWidth > 2048) {
                        intrinsicWidth = 2048;
                    }
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    if (intrinsicHeight <= 2048) {
                        i10 = intrinsicHeight;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i10, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                } else {
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        InputStream inputStreamOpen = context.getAssets().open("wallpapers/img_1.jpg");
                        try {
                            bitmapCreateBitmap2 = BitmapFactory.decodeStream(inputStreamOpen);
                            v.n(inputStreamOpen, null);
                        } finally {
                        }
                    } catch (Exception unused2) {
                        bitmapCreateBitmap2 = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                        Paint paint = new Paint();
                        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 512.0f, Color.parseColor("#1a1a2e"), Color.parseColor("#16213e"), Shader.TileMode.CLAMP));
                        canvas2.drawRect(0.0f, 0.0f, 512.0f, 512.0f, paint);
                    }
                    bitmapCreateBitmap = bitmapCreateBitmap2;
                }
            }
            this.H = bitmapCreateBitmap.getWidth();
            this.I = bitmapCreateBitmap.getHeight();
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLUtils.texImage2D(3553, 0, bitmapCreateBitmap, 0);
            if (!bitmapCreateBitmap.equals(bitmap)) {
                bitmapCreateBitmap.recycle();
            }
        }
        this.f3197d = iArr[0];
    }
}
