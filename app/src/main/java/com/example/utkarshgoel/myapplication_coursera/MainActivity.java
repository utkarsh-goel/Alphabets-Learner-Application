package com.example.utkarshgoel.myapplication_coursera;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button a=(Button)findViewById(R.id.buttonA);
        Button b=(Button)findViewById(R.id.buttonB);
        Button c=(Button)findViewById(R.id.buttonC);
        Button d=(Button)findViewById(R.id.buttonD);
        Button e=(Button)findViewById(R.id.buttonE);
        Button f=(Button)findViewById(R.id.buttonF);
        Button g=(Button)findViewById(R.id.buttonG);
        Button h=(Button)findViewById(R.id.buttonH);
        Button i=(Button)findViewById(R.id.buttonI);
        Button j=(Button)findViewById(R.id.buttonJ);
        Button k=(Button)findViewById(R.id.buttonK);
        Button l=(Button)findViewById(R.id.buttonL);
        Button m=(Button)findViewById(R.id.buttonM);
        Button n=(Button)findViewById(R.id.buttonN);
        Button o=(Button)findViewById(R.id.buttonO);
        Button p=(Button)findViewById(R.id.buttonP);
        Button q=(Button)findViewById(R.id.buttonQ);
        Button r=(Button)findViewById(R.id.buttonR);
        Button s=(Button)findViewById(R.id.buttonS);
        Button t=(Button)findViewById(R.id.buttonT);
        Button u=(Button)findViewById(R.id.buttonU);
        Button v=(Button)findViewById(R.id.buttonV);
        Button w=(Button)findViewById(R.id.buttonW);
        Button x=(Button)findViewById(R.id.buttonX);
        Button y=(Button)findViewById(R.id.buttonY);
        Button z=(Button)findViewById(R.id.buttonZ);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.apple);
                Toast.makeText(MainActivity.this,"A for Apple",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.a);
                mediaPlayer.start();
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.ball);
                Toast.makeText(MainActivity.this,"B for Ball",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.b);
                mediaPlayer.start();
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.cat);
                Toast.makeText(MainActivity.this,"C for Cat",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.c);
                mediaPlayer.start();
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.dog);
                Toast.makeText(MainActivity.this,"D for Dog",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.d);
                mediaPlayer.start();
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.elephant);
                Toast.makeText(MainActivity.this,"E for Elephant",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.e);
                mediaPlayer.start();
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.fish);
                Toast.makeText(MainActivity.this,"F for Fish",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.f);
                mediaPlayer.start();
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.giraffe);
                Toast.makeText(MainActivity.this,"G for Giraffe",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.g);
                mediaPlayer.start();
            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.helicopter);
                Toast.makeText(MainActivity.this,"H for Helicopter",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.h);
                mediaPlayer.start();
            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.icecream);
                Toast.makeText(MainActivity.this,"I for Ice Cream",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.i);
                mediaPlayer.start();
            }
        });

        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.jeep);
                Toast.makeText(MainActivity.this,"J for Jeep",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.j);
                mediaPlayer.start();
            }
        });

        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.keys);
                Toast.makeText(MainActivity.this,"K for Keys",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.k);
                mediaPlayer.start();
            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.lion);
                Toast.makeText(MainActivity.this,"L for Lion",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.l);
                mediaPlayer.start();
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.monkey);
                Toast.makeText(MainActivity.this,"M for Monkey",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.m);
                mediaPlayer.start();
            }
        });

        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.nest);
                Toast.makeText(MainActivity.this,"N for Nest",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.n);
                mediaPlayer.start();
            }
        });

        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.owl);
                Toast.makeText(MainActivity.this,"O for Owl",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.o);
                mediaPlayer.start();
            }
        });

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.panda);
                Toast.makeText(MainActivity.this,"P for Panda",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.p);
                mediaPlayer.start();
            }
        });

        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.queen);
                Toast.makeText(MainActivity.this,"Q for Queen",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.q);
                mediaPlayer.start();
            }
        });

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.robot);
                Toast.makeText(MainActivity.this,"R for Robot",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.r);
                mediaPlayer.start();
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.swing);
                Toast.makeText(MainActivity.this,"S for Swing",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.s);
                mediaPlayer.start();
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.tractor);
                Toast.makeText(MainActivity.this,"T for Tractor",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.t);
                mediaPlayer.start();
            }
        });

        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.umbrella);
                Toast.makeText(MainActivity.this,"U for Umbrella",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.u);
                mediaPlayer.start();
            }
        });

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.violin);
                Toast.makeText(MainActivity.this,"V for Violin",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.v);
                mediaPlayer.start();
            }
        });

        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.watch);
                Toast.makeText(MainActivity.this,"W for Watch",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.w);
                mediaPlayer.start();
            }
        });

        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.xray);
                Toast.makeText(MainActivity.this,"X for X-Ray",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.x);
                mediaPlayer.start();
            }
        });

        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.yoyo);
                Toast.makeText(MainActivity.this,"Y for Yo-Yo",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.y);
                mediaPlayer.start();
            }
        });

        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.zebra);
                Toast.makeText(MainActivity.this,"Z for Zebra",Toast.LENGTH_SHORT).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.z);
                mediaPlayer.start();
            }
        });
    }
}
